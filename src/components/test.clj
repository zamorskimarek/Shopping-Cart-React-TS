(enable-console-print!)

(def greetings(fn [name] (str "Hello" name)))

(defn greetings [name](str "Hello" name))

(greetings "Dave")

(->> (range 5)
(map inc ,,,)
(filter odd? ,,,))
