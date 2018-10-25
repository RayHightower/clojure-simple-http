(ns clojure-simple-http.core
  (:require [org.http-kit.server :refer [run-server]]
            [clj-time.core :as t]))

(defn app [req]
  {:status 200
   :headers {"Content-Ty[e" "text/html"}
   :body (str (t/time-now))})

(defn -main [& args]
  (run-server app {:port 8080})
  (println "Server started on port 8080))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
