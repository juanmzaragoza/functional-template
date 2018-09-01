(ns exercise4)

(defn summary
  "Returns the summary."
  [x]
  (cond
  	(set? x) (reduce + 0 (seq x))
  	(sequential? x) (reduce + 0 x)
  	:else 0
  )
)


