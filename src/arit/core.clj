(ns arit.core)

(defn lat1
  "Cari jumlah yang hasilnya 10"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 1 10))
          b (- 10 a)]
      (println "Berapa 10 - " a)
      (Thread/sleep ts)
      (println "Jawaban : " b)
      (Thread/sleep ts))))

(defn lat2
  "Latihan a + b yang hasilnya masih kurang dari 20"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 1 10))
          b (rand-nth (range 1 10))]
      (println "Berapa " a "+" b)
      (Thread/sleep ts)
      (println "Jawaban : " (+ a b))
      (Thread/sleep ts))))

(defn lat3
  "Latihan a - b"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 1 10))
          b (rand-nth (range 1 10))]
      (println "Berapa " a "-" b)
      (Thread/sleep ts)
      (println "Jawaban : " (- a b))
      (Thread/sleep ts))))

(defn lat4
  "Latihan a + b yang angkanya udah puluhan"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 11 660))
          b (rand-nth (range 11 20))]
      (println "Berapa " a "+" b)
      (Thread/sleep ts)
      (println "Jawaban : " (+ a b))
      (Thread/sleep ts))))

(defn lat5
  "Latihan a - b yang angkanya udah puluhan"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 11 660))
          b (rand-nth (range 11 20))]
      (println "Berapa " a "-" b)
      (Thread/sleep ts)
      (println "Jawaban : " (- a b))
      (Thread/sleep ts))))

(defn lat6
  "Latihan a +/- b yang angkanya udah ratusan"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 11 760))
          b (rand-nth (range 11 70))
          c (rand-nth [+ -])]
      (println "Berapa " a (if (= c +) "+" "-") b)
      (Thread/sleep ts)
      (println "Jawaban : " (if (= c +) (+ a b) (- a b)))
      (Thread/sleep ts))))

(defn lat7
  "Latihan a +/- b yang angkanya udah ratusan"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 110 960))
          b (rand-nth (range 11 500))
          c (rand-nth [+ -])]
      (println "Berapa " a (if (= c +) "+" "-") b)
      (Thread/sleep ts)
      (println "Jawaban : " (if (= c +) (+ a b) (- a b)))
      (Thread/sleep ts))))




