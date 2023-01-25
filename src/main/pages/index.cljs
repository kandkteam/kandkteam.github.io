(ns pages.index
  (:require
    [reagent.core :as r]
    [ui.svg :as svg]
    [ui.cases :refer [cases cases-outstuff]]
    [ui.honeycomb :refer [honeycomb]]
    [ui.footer :refer [footer]]
    [ui.tech-stack :refer [tech-stack]]
    [ui.contact-us :refer [contact-us]]))

(defn head
  []
  [:div.center.head
   [:div.if-not-mobile
    [:div.logo-horizontal [svg/k&k-horizontal]]
    [:div.logo-vertical [svg/k&k-vertical]]]
   [:h4 "is your"]
   [:h1 "IT partners"]
   [:a.bottom-center.we-provide
    {:href "#full-service"}
    [:span "we provide"]
    [:br]
    [:span "↓"]]])

(defn main-
  [_props]
  [:<>
   [:div.main
    [head]

    [:h1#full-service.full-service "full service"]
    [cases]

    [:div.we-provide.drop-140 [:span "we have worked with clients from"]]
    [honeycomb]

    [:div.we-provide.drop-140
     [:span "also we doing"]
     [:br]
     [:span "↓"]]
    [:h1.full-service "out staffing"]
    [cases-outstuff]

    [:div.we-provide.drop-140
     [:span "our tech stack"]
     [:br]
     [:span "↓"]]
    [tech-stack]

    [:div.we-provide.drop-140
     [:span "contact us"]
     [:br]
     [:span "↓"]]
    [contact-us]]

   [footer]])

(def ^:export main
  (r/reactify-component main-))
