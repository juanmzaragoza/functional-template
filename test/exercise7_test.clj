(ns exercise7-test
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest n-list-numbers
  (testing "Returns the third element of a list of numbers."
   (is (= (enesimo 2 '(4 5 6 7)) 6))))
   
(deftest n-vector-keys
  (testing "Returns the first element of a vector of keys."
   (is (= (enesimo 0 [:a :b :c]) :a))))

(deftest n-vector-numbers
  (testing "Returns the second element of a vector of numbers."
   (is (= (enesimo 1 [1 2 3 4]) 2))))
			    
(deftest n-list-of-array
  (testing "Returns the second element of a list of vectors."
   (is (= (enesimo 2 '([1 2] [3 4] [5 6])) [5 6]))))