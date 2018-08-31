(ns exercise2)

(defn only-greater-than-five
  "Returns only numbers greather than five."
  [numbers]
  (filter (fn [n] (< 5 n)) numbers)
)


