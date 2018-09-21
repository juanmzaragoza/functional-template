(ns exercise24)

(defmulti ultimo
	(fn[coll] (type coll)))

;into - agarra un conjunto de datos y los mete 
;dentro de una estructura
(defmethod ultimo clojure.lang.PersistentList [coll]
	(last coll))

(defmethod ultimo clojure.lang.PersistentVector [coll]
	(last coll))

(defmethod ultimo :default [coll]
	"Tipo no soportado")


