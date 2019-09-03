(ns webzueri-demo.prod
  (:require [webzueri-demo.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
