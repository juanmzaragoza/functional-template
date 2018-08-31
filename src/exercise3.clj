(ns exercise3)

(defn fibonacci
  "Returns the value of the position in the fibonacci sucesion."
  [x]
  (cond
  	(= x 0) 0
  	(= x 1) 1
  	:else (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
  )
)


