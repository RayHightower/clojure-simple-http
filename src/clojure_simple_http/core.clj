(ns clojure-simple-http.core
  (:require [clojure.test :refer [is testing with-test deftest run-tests]]
            [org.httpkit.server :refer [run-server]]
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
           (GET "/" [] "<h1>This is only a test.</h1><br/><h3>Do not be alarmed!<br/>Now we know that the Clojure server works, even though it depends on a library called http-kit :-)<br/><a href=\"/get-time\">What time is it?</a><br/><a href=\"/not-found\">What does the 404 page look like?</a></h3>")
           (GET "/get-time" [] (get-time))
           (route/not-found "<h1>RTH's Magic 404 Page<br/>Page not found</h1><br/><br/><a href=\"/\">Back home.</a>"))


(defn -main [& args]
  (def port 8080)
  (def items (str "Server started on port " port))
  (run-server app {:port port})
  (println items))

(run-tests)