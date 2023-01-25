(ns ui.cases)

(defonce k&k-company-summary-text "K&K TEAM becomes your company’s IT department. We cover the full development cycle from research and design, to infrastructure setup and product development. We can do everything from consulting to presentation for investors.")
(defonce outstuff-summary "We can provide some of our specialists for your company with paid per hour system. They will be included in your project flow, corporate chats, etc.\nWe have qualified designers, developers, QA-engineers, DevOps engineers, and managers.")
(defonce case-b2c "Online appointment booking service allowing to schedule appointments with beauty professionals. We developed the following components: system design, a website with client area, administrative dashboard with detailed stats and management options for business owners, profile area for professionals, mobile app for Android and iOS, server side.")
(defonce case-bsk "is an IT enterprise and a platform that allows to streamline the process of buying automotive parts. We came up with a new way of business interaction and communication. Thanks to the transparent purchasing process, efficient documenting tools, reliable suppliers, and user-friendly design, the platform has become popular and lucrative.")
(defonce case-wisp "is a project where users can participate in platform-organized tournaments, organize them for each other and just play games, setting bids on their skills! Players from all over the world will be able to get NFTs as rewards for tournaments and tasks, use connected visuals in their virtual rooms, build collections and resell them. ")
(defonce case-rentity "is an Estonian startup that  makes most revolutionary application in PropTech field, that helps you find new home without any stress.\nK&K TEAM participate in whole branches of startup development: design, management, architecture, mobile development, web development, marketing, finances.")
(defonce case-evenflow "is a European company operating in the Earth Observation industry since 2008. We cooperate in software development and server infrastructure support.")
(defonce case-menivim "is a real estate search platform for Israel market.Our team contributed to the backend development of the project what includes optimization, bug fixing and development of new features.")

(defn breadcrumbs
  [titles]
  (into [:ul.breadcrumbs]
        (for [t titles]
          [:li t])))

(defn cases
  []
  [:div.cases
   [:div.content-pic
    [:div.content k&k-company-summary-text]
    [:div.image
     [:img
      {:src (js/require "../../public/img/kandk-summary-2.png?webp")
       :width "782"
       :height "1080"}]]]

   [:div.content-pic
    [:div.content
     [breadcrumbs ["Bad Android app" "Working service"]]
     [:h1 "b2c-service"]
     [:span case-b2c]
     [:a.read-more {:href "https://b2c.by"} "Read more →"]]
    [:div.image
     [:img
      {:src (js/require "../../public/img/case-b2c.png?webp")
       :width "950"
       :height "1080"}]]]

   [:div.content-pic
    [:div.content
     [breadcrumbs ["Excel file with idea" "$$$$ income"]]
     [:h1 "bsktrade"]
     [:span case-bsk]
     [:a.read-more {:href "https://bsktrade.by"} "Read more →"]]
    [:div.image
     [:img
      {:src (js/require "../../public/img/case-bsk.png?webp")
       :width "783"
       :height "1080"}]]]

   [:div.content-pic
    [:div.content
     [breadcrumbs ["Idea" "MVP"]]
     [:h1 "wisp"]
     [:span case-wisp]
     [:a.read-more {:href "https://wisp.game/"} "Read more →"]]
    [:div.image
     [:img
      {:src (js/require "../../public/img/case-wisp.png?webp")
       :width "783"
       :height "1080"}]]]

   [:div.content-pic
    [:div.content
     [breadcrumbs ["Idea" "MVP"]]
     [:h1 "rentity"]
     [:span case-rentity]
     [:a.read-more {:href "https://rentity.ee/"} "Read more →"]]
    [:div.image
     [:img
      {:src (js/require "../../public/img/case-rentity.png?webp")
       :width "783"
       :height "1080"}]]]])

(defn cases-outstuff
  []
  [:div.cases
   [:div.content-pic
    [:div.content outstuff-summary]
    [:div.image
     [:img
      {:src (js/require "../../public/img/outstuff-summary.png?webp")
       :width "782"
       :height "1080"}]]]

   [:div.content-pic
    [:div.content
     [breadcrumbs ["Backend & Frontend"]]
     [:h1 "evenflow"]
     [:span case-evenflow
      [:div.if-not-mobile
       [:div (repeat 5 [:br])]]]
     [:a.read-more {:href "https://evenflow.eu"} "evenflow.eu"]]
    [:div.image
     [:img
      {:src (js/require "../../public/img/case-evenflow.png?webp")
       :width "783"
       :height "1080"}]]]

   [:div.content-pic
    [:div.content
     [breadcrumbs ["Backend part"]]
     [:h1 "menivim"]
     [:span case-menivim
      [:div.if-not-mobile
       [:div (repeat 5 [:br])]]]
     [:a.read-more {:href "https://menivim.net"} "menivim.net"]]
    [:div.image
     [:img
      {:src (js/require "../../public/img/case-menivim.png?webp")
       :width "783"
       :height "1080"}]]]])
