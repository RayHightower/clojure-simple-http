(defproject clojure-simple-http "0.1.0-SNAPSHOT"
  :author "Raymond T. Hightower"
  :description "Simple HTTP Server, a Clojure Experiment"
  :min-lein-version "2.7.1"
  ; :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.2.0"]
                 [clj-time "0.14.0"]
                 [compojure "1.6.0"]]
  :main clojure-simple-http.core)
