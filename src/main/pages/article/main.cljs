(ns pages.article.main
  (:require
    [reagent.core :as r]
    ["next/link" :default Link]))

(defn main
  {:export true
   :next/page "index"}
  [props]
  (prn props)
  (r/as-element
    [:div.flex.column.vh100
     [:> Link
      {:href "/"}
      [:a "Домой"]]]))