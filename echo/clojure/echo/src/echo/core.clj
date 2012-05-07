(ns echo.core
  (:use [cheshire.core]))

(defn app [request]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (generate-string (parse-string (slurp (request :body))))})
