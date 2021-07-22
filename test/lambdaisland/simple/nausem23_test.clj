(ns lambdaisland.simple.nausem23-test
(:require [clojure.test :refer :all])
)

(deftest should-pass
(testing "ridiculous test that should pass"
  (is (do (Thread/sleep 1000) (= 1 1)))))