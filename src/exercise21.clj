(ns exercise21)

(defmulti multimetodo-figuras
	(fn[figure] (figure :tipo)))

(defmethod multimetodo-figuras "figuras.rectangulo" [params]
 "Soy un figuras.rectangulo")

(defmethod multimetodo-figuras "figuras.cuadrado" [params]
 "Soy un figuras.cuadrado")

(defmethod  multimetodo-figuras :default [params]
 "No soy una figura")


