(ns lambdaisland.wiki.nausem03-test
(:require [clojure.test :refer :all])
)

(deftest should-pass
(testing "ridiculous test that should pass"
  (is (not (empty? (slurp "https://en.wikipedia.org/wiki/Special:Random" )))) ))