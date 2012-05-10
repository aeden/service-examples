(defproject docstore "1.0.0-SNAPSHOT"
  :description "Web service that stores a document"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [ring/ring "1.1.0"]
                 [org.clojure/java.jdbc "0.0.6"]
                 [postgresql/postgresql "8.4-702.jdbc4"]]
  :dev-dependencies [[lein-exec "0.1"]
                     [ring-mock "0.1.2"]])
