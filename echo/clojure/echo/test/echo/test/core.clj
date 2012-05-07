(ns echo.test.core
  (:use [echo.core])
  (:use [clojure.test])
  (:use [ring.mock.request]))

(deftest app-test
  (is (= (app (body (request :post "/"), "{\"foo\":\"bar\"}")) 
         {:status 200
          :headers {"Content-Type" "application/json"}
          :body "{\"foo\":\"bar\"}"})))
