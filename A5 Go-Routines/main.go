package main

import (
	"errors"
	"fmt"
	"math/rand"
	"sync"
	"time"
)

// Result is a type representing a single result with its index from a slice.
type Result struct {
	index  int
	result string
}

func foodMenu() (string, error) {
	rand.Seed(time.Now().UnixNano())
	n := rand.Intn(20) // random number from 0-20
	time.Sleep(3*time.Second + time.Duration(n)*time.Second)

	// 50% chance of failing task
	if n <= 10 {
		return "Done", errors.New("Failed Task")
	}

	return "Done", nil

}

func main() {

	var foodOrders []func() (string, error)

	for i := 0; i < 12; i++ {
		foodOrders = append(foodOrders, foodMenu)
	}

	o := ConcurrentRetry(foodOrders, 15, 11)
	o2 := ConcurrentRetry(foodOrders, 21, 4)

	for ch := range o {
		fmt.Println(ch)
		fmt.Println("WAITING FOR THE NEXT OUTPUT...")
	}

	for ch2 := range o2 {
		fmt.Println(ch2)
		fmt.Println("WAITING FOR THE NEXT OUTPUT...")
	}

	fmt.Println("Finished tasks!!!")
}

//function that does the task
func microwave(ID int, jobs <-chan func() (string, int, error), result chan<- Result, retry int, wg *sync.WaitGroup) {

	fmt.Println("MICROWAVE WITH SERIALNUMBER:", ID, "Plugged in and ready to re-heat..")
	for task := range jobs {

		failed := true

		for i := 0; i < retry; i++ {
			str, ind, err := task()
			fmt.Println("MICROWAVE WITH SERIALNUMBER:", ID, "working on food item number:", ind)
			if err == nil {
				fmt.Println("MICROWAVE WITH SERIALNUMBER:", ID, "finished microwaving in", i+1, "attempts")
				toSend := Result{ind, str}
				defer wg.Done()
				failed = false
				result <- toSend
				break
			}
			fmt.Println("MICROWAVE WITH SERIALNUMBER:", ID, "re-heating food in position ", ind)
		}

		if failed {
			fmt.Println("MICROWAVE WITH SERIALNUMBER:", ID, "failed to heat the food in ", retry, "attempts")
			defer wg.Done()
		}
	}
}

// ConcurrentRetry runs all the tasks concurrently and sends the output in a Result channel.
func ConcurrentRetry(tasks []func() (string, error), concurrent int, retry int) <-chan Result {

	var wg sync.WaitGroup

	fmt.Println("Creating job channel")
	jobsChannel := make(chan func() (string, int, error), len(tasks))
	fmt.Println("Creating result channel")
	resultChannel := make(chan Result, len(tasks))

	fmt.Println("Builing", concurrent, "microwaves for the Food Heating Factory")

	// Start microwaves
	for i := 0; i < concurrent; i++ {
		go microwave(i, jobsChannel, resultChannel, retry, &wg)
	}

	fmt.Println("Gattering jobs...")
	fmt.Println("Filling job queue")
	fmt.Println("Passing job queue to jobsChannel")

	for i := 0; i < len(tasks); i++ {

		wg.Add(1)
		fun := tasks[i]
		ind := i
		task := func() (string, int, error) {
			str, err := fun()
			return str, ind, err
		}

		jobsChannel <- task
	}

	fmt.Println("Closing job queue channel")

	close(jobsChannel)

	// When all tasks are done close the result channel
	go func() {
		wg.Wait()
		close(resultChannel)
	}()

	fmt.Println("Returning the output channel")

	return resultChannel
}
