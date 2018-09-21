(ns exercise24-test
  (:require [clojure.test :refer :all]
            [exercise24 :refer :all]))


(deftest ultimo-returns-the-last-element-from-a-list
  (testing "Tests pass a list of numbers and return the last one."
    (is (= (ultimo '(5 4 3)) 3))))

(deftest ultimo-returns-the-last-element-from-a-vector
  (testing "Tests pass a vector of numbers and return the last one."
    (is (= (ultimo [1 2 3 4 5]) 5))))

(deftest ultimo-returns-the-last-element-from-a-strings-vector
  (testing "Tests pass a vector of characters and return the last one."
    (is (= (ultimo ["b" "c" "d"]) "d"))))


(deftest ultimo-returns-a-message-to-unsupported-collection
  (testing "Test with an string and returns a message about unsupported type."
    (is (= (ultimo "Soy un tipo no soportado") "Tipo no soportado"))))

(deftest ultimo-returns-another-message-to-unsupported-collection
  (testing "Test with an PersistentArrayMap and returns a message about unsupported type."
    (is (= (ultimo {:a 1 :b 2}) "Tipo no soportado"))))
