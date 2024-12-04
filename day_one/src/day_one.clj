(ns day-one
  (:require [aocifetch.core :as ifetch]))

(defn extract-location [input]
  (map parse-long (re-seq #"\d" input)))

(defn allocate-locations [locations]
  (apply map vector (partition 2 locations)))

(defn location-differences )

(defn parse-input-data [puzzle-input]
  [[3 4 2 1 3 3] [4 3 5 3 9 3]])

(defn solve-the-puzzle
  [puzzle-input]
  (let [year "2024" day "1"
        puzzle-input (ifetch/fetch-input year day)])
  11)
