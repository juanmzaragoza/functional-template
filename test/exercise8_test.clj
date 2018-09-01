(ns exercise8-test
  (:require [clojure.test :refer :all]
            [exercise8 :refer :all]))
                
(deftest split-vector-numbers
  (testing "Returns the a vector with two sequences of numbers."
    (is (= (separador 3 [1 2 3 4 5 6]) ['(1 2 3) '(4 5 6)]))
  )
)
   
(deftest split-vector-keys
  (testing "Returns the a vector with two sequences of keys."
    (is (= (separador 1 [:a :b :c :d])  ['(:a) '(:b :c :d)]))))

(deftest split-vector-vectors
  (testing "Returns the n element of a vector of vectors."
    (is (= (separador 2 [[1 2] [3 4] [5 6]])  ['([1 2] [3 4]) '([5 6])]))))
