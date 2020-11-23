(define (merge-sort lstA lstB)


  {cond


    [(empty? lstA) lstB]


    [(empty? lstB) lstA]


    [(< (first lstA) (first lstB))

         (cons (first lstA)  (merge-sort (rest lstA) lstB))]


    [else (cons (first lstB) (merge-sort lstA (rest lstB)))]})
    