

(def greetings (fn [name] (str "Hello" name)))

(defn greetings2 [name] (str "Hello" name))


(defn greet  [name]  (str "Hello, " name))
(->> (greet "students"))

(->> (range 7)
     (map inc)
     (filter odd?))


(let [x 1
      y 2
      z (+ x y)]
  (println z))
