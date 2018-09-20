(ns exercise21-test
  (:require [clojure.test :refer :all]
            [exercise21 :refer :all]))

(deftest figures-multimethod-show-reactangule-message
  (testing "Tests with a figure that return figuras.rectangulo."
    (is (= (multimetodo-figuras (def cuadrado {:nombre "rectangulo" :tipo "figuras.rectangulo"})) "Soy un figuras.rectangulo"))))

(deftest figures-multimethod-show-square-message
  (testing "Tests with a figure that return figuras.cuadrado"
    (is (= (multimetodo-figuras (def cuadrado {:nombre "cuadrado" :tipo "figuras.cuadrado"})) "Soy un figuras.cuadrado"))))

(deftest figures-multimethod-show-empty-value
  (testing "Tests with a figure that return empty value"
    (is (= (multimetodo-figuras (def cuadrado {:nombre "cuadrado" :tipo ""})) "Soy un "))))
