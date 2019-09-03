(ns webzueri-demo.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [webzueri-demo.core-test]))

(doo-tests 'webzueri-demo.core-test)
