(ns ui.tech-stack
  (:require [ui.svg :as svg]
            [reagent.core :as r]))

(def lang-tags
  (svg/tech-svg-require [:c-sharp :js :ts :c :python :php :clj :cljs :dart]))

(def framework-tags
  ; :luminus
  (svg/tech-svg-require [:express :flask :react :django :gatsby
                         :flutter :nodejs :shopify :angular :next :vue :wp]))

(def db-tags
  (svg/tech-svg-require [:sphinx :postgresql :hasura :mongodb :datomic
                         :elasticsearch :graphql :datahike :mysql]))

(def design-tags
  (svg/tech-svg-require [:xd :ai :ps :axure :ad :figma :sketch]))


(defn tab-label
  [title & [props]]
  (r/with-let [id (gensym)]
    [:<>
     [:input
      (merge {:id id
              :type "radio"
              :name "tabset"
              :aria-controls title}
             props)]
     [:label
      {:for id}
      title]]))

(defn tech-stack
  []
  [:div.tech-stack-container
   [:div.tabset
    [tab-label "Languages" {:default-checked true}]
    [tab-label "Frameworks"]
    [tab-label "Databases"]
    [tab-label "Design"]

    [:div.tab-panels
     [:section.tab-panel
      (into [:div.tech-stack.lang]
            lang-tags)]

     [:section.tab-panel
      (into [:div.tech-stack.framework]
            framework-tags)]

     [:section.tab-panel
      (into [:div.tech-stack.db]
            db-tags)]

     [:section.tab-panel
      (into [:div.tech-stack.design]
            design-tags)]]]])
