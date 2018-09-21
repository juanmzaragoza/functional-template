(ns exercise23-test
  (:require [clojure.test :refer :all]
            [exercise23 :refer :all]))


(deftest fmap-returns-a-list
  (testing "Tests apply increment function to a list and returns a list."
    (is (= (fmap inc (list 1 2 3)) '(2 3 4)))))

(deftest fmap-returns-a-vector
  (testing "Tests apply incrementfunction to a vector and returns a vector."
    (is (= (fmap inc [1 2 3 4]) [2 3 4 5]))))

(deftest fmap-returns-a-dictonary
  (testing "Tests apply increment function to a dictonary and returns a dictonary."
    (is (= (fmap inc {:a 1 :b 2}) {:a 2 :b 3}))))


(deftest fmap-returns-an-empty-list
  (testing "Test with an empty list and returns something."
    (is (= (fmap inc '()) "Soy un default"))))
