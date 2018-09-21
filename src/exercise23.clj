(ns exercise23)

(defmulti fmap
	(fn[func coll] (type coll)))

;into - agarra un conjunto de datos y los mete 
;dentro de una estructura
(defmethod fmap clojure.lang.PersistentList [func coll]
	(map func coll))

(defmethod fmap clojure.lang.PersistentVector [func coll]
	(map func coll))

(defmethod fmap clojure.lang.PersistentArrayMap [func coll]
	(into {} 
		(map (fn [[key value]] [key (func value)])
            coll)))

(defmethod fmap :default [func coll]
	"Soy un default")


