(ns clojure-simple-http.core
  (:require [org.httpkit.server :refer [run-server]]
            [clj-time.core :as t]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defn get-time
  []
  (let [response {:status  200
                  :headers {"Content-Type" "text/html"}
                  :body    (str (t/time-now))}]
    response))

(defroutes app
           (GET "/" [] "<h1>This is only a test.</h1><br/><h3>Do not be alarmed!<br/>Now we know that the Clojure server works, even though it depends on a library called http-kit :-)</h3>")
           (GET "/get-time" [] (get-time))
           (route/not-found "<h1>Page not found</h1>"))


(defn -main [& args]
  (run-server app {:port 8080})
  (println "Server started on port 8080"))
