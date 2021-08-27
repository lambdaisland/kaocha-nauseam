(ns lambdaisland.io.nausem283-test
(:require [clojure.test :refer :all])
)

(deftest should-pass
(testing "ridiculous test that should pass"
  (is (not (empty? (slurp "README.md")))) ))