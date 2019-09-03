(ns ^:figwheel-no-load webzueri-demo.dev
  (:require
    [webzueri-demo.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
