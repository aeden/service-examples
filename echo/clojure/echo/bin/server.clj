(use 'ring.adapter.jetty)
(use 'echo.core)
(run-jetty app {:port 3000})
