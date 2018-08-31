(ns exercise3)

(defn fibonacci
  "Returns the value of the position in the fibonacci sucesion."
  [numbers]
  (filter (fn [n] (< 5 n)) numbers)
)


