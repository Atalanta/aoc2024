(ns day-one-spec
  (:require [speclj.core :refer :all]
            [day-one :refer :all]))

(describe "Location difference finder"
          (it "computes total difference between two lists of locations"
              (should= 6 (sum-of-differences [5 3 9] [7 1 3]) )))
