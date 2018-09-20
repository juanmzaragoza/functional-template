(ns exercise22-test
  (:require [clojure.test :refer :all]
            [exercise22 :refer :all]))


(deftest things-multimethod-show-string-message
  (testing "Tests with a param that return that is a string."
    (is (= (multimetodo-things "esto es un string") "Soy un String"))))

(deftest things-multimethod-show-vector-message
  (testing "Tests with a param that return that is a vector."
    (is (= (multimetodo-things [1 2]) "Soy un vector"))))

(deftest things-multimethod-show-default-message
  (testing "Tests with a param that return that is a default."
    (is (= (multimetodo-things '()) "Soy un default"))))
