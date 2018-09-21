(ns exercise23)

(defmulti fmap
	(fn[func coll] (type coll)))

;into - agarra un conjunto de datos y los mete 
;dentro de una estructura
(defmethod fmap java.lang.String [func coll]
 "Soy un String")

(defmethod fmap clojure.lang.PersistentVector [func coll]
	(map func coll))

(defmethod fmap :default [func coll]
 "Soy un default")


