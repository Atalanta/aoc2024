(ns day-one)

(defn generate-pairs 
 [first-list second-list] 
 (map list 
      (sort first-list) 
      (sort second-list)))

(defn calculate-difference 
 [pair] 
 (Math/abs (apply - pair)))

(defn sum-of-differences 
 [first-list second-list]
 (reduce + 
         (map calculate-difference 
              (generate-pairs first-list second-list))))
