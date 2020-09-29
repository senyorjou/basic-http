(ns basic.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))


(defn page
  []
  )


(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/page" {{:keys [user-id]} :session}
       (str "<h1>Hello user " user-id "</h1>"))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
