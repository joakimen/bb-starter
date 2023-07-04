(ns bb-starter.cli)

(defn greet [m]
  (println (str "Hello, " (or (:name m) "World"))))
