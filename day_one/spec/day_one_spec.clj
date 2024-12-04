(ns day-one-spec
  (:require [speclj.core :refer :all]
            [day-one :refer :all]
            [aocifetch.core :as ifetch]))

(describe "Advent of Code Day 1 solution"
  (it "solves correctly for the puzzle example data"
    (with-redefs [ifetch/fetch-input (fn [_ _] "3   4\n4   3\n2   5\n1   3\n3   9\n3   3\n")]
      (should= 11 (solve-the-puzzle []))))
  (it "solves correctly for the modified example data"
    (with-redefs [ifetch/fetch-input (fn [_ _] "3   4\n4   3\n2   6\n1   3\n3   9\n3   3\n")]
      (should= 12 (solve-the-puzzle []))))
  (it "calculates location differences"
    (should= [2 1 0 1 2 5]
             (location-differences [1 2 3 3 3 4] [3 3 3 4 5 9])))
  
  (context "when parsing the input data"
    (it "creates location lists for each team"
      (should= [[3 4 2 1 3 3] [4 3 5 3 9 3]]
               (parse-input-data "3   4\n4   3\n2   5\n1   3\n3   9\n3   3\n"))
      (should= [[4 5 3 2 4 4] [4 3 5 3 9 3]]
               (parse-input-data "4   4\n5   3\n3   5\n2   3\n4   9\n4   3\n")))
    (it "extracts location"
      (should= [3 4 4 3 2 5 1 3 3 9 3 3]  (extract-location "3   4\n4   3\n2   5\n1   3\n3   9\n3   3\n"))
      )

    (it "allocates locations to teams"
      (should= [[3 4 2 1 3 3] [4 3 5 3 9 3]]
               (allocate-locations [3 4 4 3 2 5 1 3 3 9 3 3]))
      )))

