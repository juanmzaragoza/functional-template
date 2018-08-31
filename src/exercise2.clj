(ns exercise2)

(defn only-greater-than-five
  "Returns only numbers greather than five."
  [x]
  (filter (fn [n] (< 5 n)) numbers)
)


