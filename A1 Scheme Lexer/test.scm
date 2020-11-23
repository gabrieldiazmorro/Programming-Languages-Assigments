

( define (sum h)
	(cond
		((<= h 0 ) 
			0
		)
		(else
		    (+ ( sum (- h 1) ) 1)  
		)
	)
) 

(sum 10)

(define gcd
           (lambda (a b)
                   (if (= a b)
                          a
                          (if (> a b)
                                       (gcd (- a b) b)
                                      (gcd a (- b a))))))

(define isort (lambda (l)
           (letrec
              ((insert  (lambda (x l)
                 (if (null? l)
                    (list x)
                    (if (<= x (car l))
                       (cons x l)
                       (cons (car l) (insert x (cdr l)))))))))

           (if (null? l)
                   nil
                   (insert (car l) (isort (cdr l))))))