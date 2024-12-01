(ns day-one-spec
 (:require [speclj.core :refer :all]
           [day-one :refer :all]))

(describe "Location difference finder"
 (it "computes total difference between two lists of locations"
   (should= 6 (sum-of-differences '(5 3 9) '(7 1 3)))
   (should= 14 (sum-of-differences '(2 4 6) '(6 8 12))))
 
 (context "when performing initial sort"
   (it "produces a sorted list of paired locations"
     (should= '((1 2) (2 3) (3 4)) 
              (generate-pairs '(3 1 2) '(3 2 4)))))
 
 (context "when calculating the difference between location pairs"
   (it "finds the absolute difference regardless of order and sign"
     (should= 4 (calculate-difference '(7 3))))))
