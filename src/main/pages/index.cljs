(ns pages.index
  (:require
    [shadow.next-js :as sn]
    ["next/link" :default Link]
    [reagent.core :as r]))

(defn main
  {:export true
   :next/page "index"}
  [props]
  (prn props)
  (r/as-element
            [:div.flex.column.vh100
             [:> Link
              {:href "/articles/main"}
              [:a "статья 6"]]]))
