(ns lambdaisland.simple-fail.nausem88-test
(:require [clojure.test :refer :all])
)

(deftest should-pass
(testing "ridiculous test that should pass"
  (is (do (Thread/sleep 1000) (= 1 2)))))