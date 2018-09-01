(ns exercise11)

(defn fmap-nil
  "Returns true if map has a nil value in the k key ."
  [the-map k]
  (= (the-map k) nil)
)
