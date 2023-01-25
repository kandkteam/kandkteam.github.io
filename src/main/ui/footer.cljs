(ns ui.footer)

(def email "contact@kandk.team")
(def telegram-href "tg://resolve?domain=manager_kandk")
(def linkedin-href "https://www.linkedin.com/company/k-k-team/")

(defn footer
  []
  [:div.footer
   [:a {:href (str "mailto:" email)} email]
   " "
   [:a {:href telegram-href} "Telegram"]
   " "
   [:a {:href linkedin-href} "LinkedIn"]

   [:div.company-info
    [:h1 "K&K TECHNOLOGIES OÜ"]
    [:h2 "Tallinn, Ravi tn 2, 10134"]
    [:h2 "16111977"]]])
