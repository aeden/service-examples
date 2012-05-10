(ns docstore.core
  (:require [clojure.java.jdbc :as sql]))

(def db
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "//localhost:5432/service-examples"
   :user "aeden"
   :password ""})

(defn create-document [name body]
  (sql/with-connection db
    (sql/insert-record :documents {:name name :body body}))) 

(defn find-document [name]
  (peek (sql/with-connection db
    (sql/with-query-results results
      ["select * from documents where name = ? limit 1" name]
      (into [] results)))))

(defn app [request]
  (let [body (slurp (request :body))]
    (create-document (request :uri) body)
    {:status 201
     :headers {"Content-Type" "application/json"}
     :body body}))
