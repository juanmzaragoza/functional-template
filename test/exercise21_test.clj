(ns exercise21-test
  (:require [clojure.test :refer :all]
            [exercise21 :refer :all]))

(def cuadrado {:nombre "cuadrado" :tipo "figuras.cuadrado"})
(def rectangulo {:nombre "rectangulo" :tipo "figuras.rectangulo"})
(def nofigura {:nombre "rectangulo" :tipo "figuras.rectangul2o"})

(deftest figures-multimethod-show-reactangule-message
  (testing "Tests with a figure that return figuras.rectangulo."
    (is (= (multimetodo-figuras rectangulo) "Soy un figuras.rectangulo"))))

(deftest figures-multimethod-show-square-message
  (testing "Tests with a figure that return figuras.cuadrado"
    (is (= (multimetodo-figuras cuadrado) "Soy un figuras.cuadrado"))))

(deftest figures-multimethod-show-empty-value
  (testing "Tests with a any value that it isn't a figure"
    (is (= (multimetodo-figuras nofigura) "No soy una figura"))))
