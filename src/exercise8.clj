(ns exercise8)

(defn separador
  "Returns a vector of lists separated from idx."
  [idx x]
  (split-at idx x)
)