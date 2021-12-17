(ns quandlclj.core)

(defonce api-key (atom ""))

(defn set-api-key! [key] (swap! api-key key))

