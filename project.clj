(defproject clojure-simple-http "0.1.0-SNAPSHOT"
  :author "Raymond T. Hightower"
  :description "FIXME: write description"
  :min-lein-version "2.7.1"
  ; :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.2.0"]]
  :jvm-opts ["--add-modules" "java.xml.bind"] ; Other folks have the same issue? https://github.com/bhauman/lein-figwheel/issues/612
  :main clojure-simple-http.core)
