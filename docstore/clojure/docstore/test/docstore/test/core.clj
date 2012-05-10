(ns docstore.test.core
  (:use [docstore.core])
  (:use [clojure.test])
  (:use [ring.mock.request]))

(deftest app-test 
  (let [document "{\"title\": \"Test Document\", \"author\":\"Bob\"}"]
    (is (= (app (body (request :post "/test-document"), document))
          {:status 201
           :headers {"Content-Type" "application/json"}
           :body document}))
    (is (= "{\"title\": \"Test Document\", \"author\":\"Bob\"}" (get (find-document "/test-document") :body)))))
