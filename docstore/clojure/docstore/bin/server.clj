(use 'ring.adapter.jetty)
(use 'docstore.core)
(run-jetty app {:port 3000})
