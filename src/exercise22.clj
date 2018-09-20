(ns exercise22)

(defmulti multimetodo-things
	(fn[thing] (type thing)))

(defmethod multimetodo-things java.lang.String [thing]
 "Soy un String")

(defmethod multimetodo-things clojure.lang.PersistentVector [thing]
 "Soy un vector")

(defmethod  multimetodo-things :default [thing]
 "Soy un default")


