(defproject hello "0.1.0-SNAPSHOT"
  :description "Hello world"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :aot :all
  :main hello.core
  :uberjar-name "hello.jar")
