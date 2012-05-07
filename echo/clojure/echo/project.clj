(defproject echo "1.0.0-SNAPSHOT"
  :description "Web service that parses and echoes JSON data"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ring/ring "1.1.0"]
                 [cheshire "4.0.0"]]
  :dev-dependencies [[lein-exec "0.1"]
                     [ring-mock "0.1.2"]])
