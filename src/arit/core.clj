(ns arit.core)

(defn trim
  [n d]
  (let [ed (Math/pow 10 d)]
    (/ (int (* ed n)) ed 1.0)))

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
          b (rand-nth (range 1 10))]
      (println "Berapa " a "+" b)
      (Thread/sleep ts)
      (println "Jawaban : " (+ a b))
      (Thread/sleep ts))))

(defn lat5
  "Latihan a - b yang angkanya udah puluhan"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 11 60))
          b (rand-nth (range 1 20))]
      (println "Berapa " a "-" b)
      (Thread/sleep ts)
      (println "Jawaban : " (- a b))
      (Thread/sleep ts))))

(defn lat6
  "Latihan a +/- b yang angkanya udah ratusan"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 11 60))
          b (rand-nth (range 11 30))
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
          b (rand-nth (range 31 50))
          c (rand-nth [+ -])]
      (println "Berapa " a (if (= c +) "+" "-") b)
      (Thread/sleep ts)
      (println "Jawaban : " (if (= c +) (+ a b) (- a b)))
      (Thread/sleep ts))))

(defn lat8
  "Latihan a * b yang angkanya cupu"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 1 10))
          b (rand-nth (range 1 10))]
      (println "Berapa " a "*" b)
      (Thread/sleep ts)
      (println "Jawaban : " (* a b))
      (Thread/sleep ts))))

(defn lat9
  "Latihan a * 5"
  [n ts]
  (println "Trick bagi 2 kali 10")
  (dotimes [i n]
    (let [a (rand-nth (range 10 100 2))]
      (println "Berapa " a "*" 5)
      (Thread/sleep ts)
      (println "Jawaban : " (* a 5))
      (Thread/sleep ts))))

(defn lat10
  "Latihan a * 2 atau a * 3 atau a * 5"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 10 100 2))
          b (rand-nth [2 5])]
      (println "Berapa " a "*" b)
      (Thread/sleep ts)
      (println "Jawaban : " (* a b))
      (Thread/sleep ts))))

(defn lat11
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 12 30 4))
          b (rand-nth [5 25 50])]
      (println "Berapa " a "*" b)
      (Thread/sleep ts)
      (println "Jawaban : " (* a b))
      (Thread/sleep ts))))

(defn lat12
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 19 100 10))
          b (rand-nth [2 3])]
      (println "Berapa " a "*" b)
      (Thread/sleep ts)
      (println "Jawaban : " (* a b))
      (Thread/sleep ts))))

(defn lat13
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (concat (range 19 100 10) (range 18 100 10)))
          b (rand-nth [2 3])]
      (println "Berapa " a "*" b)
      (Thread/sleep ts)
      (println "Jawaban : " (* a b))
      (Thread/sleep ts))))

(defn lat14
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (map #(* 10 %) (range 3 20 2)))]
      (println "Berapa " a "/" 2)
      (Thread/sleep ts)
      (println "Jawaban : " (/ a 2))
      (Thread/sleep ts))))

(defn lat15
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (map #(* 10 %) (range 3 20 2)))
          b (rand-nth (range 2 10 2))]
      (println "Berapa " (+ a b) "/" 2)
      (Thread/sleep ts)
      (println "Jawaban : " (/ (+ b a) 2))
      (Thread/sleep ts))))

(defn lat16
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth [5 10 15 20 25 30 70 75 80 90])
          b (rand-nth (range 10 100 10))]
      (println "Berapa " a "%" "dari" b)
      (Thread/sleep ts)
      (println "Jawaban : " (/ (* a b) 100.0))
      (Thread/sleep ts))))

(defn lat17
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 50 98))
          b (rand-nth (range 1 a))]
      (println "Berapa " b "/" a)
      (Thread/sleep ts)
      (println "Jawaban : " (trim (/ b a) 2))
      (Thread/sleep ts))))

(defn lat18
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 3 10))
          b (rand-nth (range 1 a))]
      (println "Berapa persenkah " b "/" a)
      (Thread/sleep ts)
      (println "Jawaban : " (trim (* 100 (/ b a)) 2) "%")
      (Thread/sleep ts))))

(defn lat19
  "Latihan a * 5 atau a * 25 atau a * 50"
  [n ts]
  (dotimes [i n]
    (let [a (rand-nth (range 3 10))
          b (rand-nth (range 1 (* 2 a)))]
      (println "Berapa persenkah " b "/" a)
      (Thread/sleep ts)
      (println "Jawaban : " (trim (* 100 (/ b a)) 2) "%")
      (Thread/sleep ts))))

(defn lat
  [n speed step sampe]
  (let [i (atom 0)]
    (doseq [f (map #(eval (symbol (str "lat" %))) (range 1 sampe))]
      (f n (+ speed (* @i step)))
      (swap! i inc))))
















































