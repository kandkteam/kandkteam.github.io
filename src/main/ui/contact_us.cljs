(ns ui.contact-us)

(def web3forms-api "https://api.web3forms.com/submit")
(def web3forms-token "d4c451be-cd16-47c9-87df-b0ad14904857")
(def email-subject "New Submission from K&K website")

(def privacy-text
  [:<>
   "By clicking on the button, I accept the terms of the transfer of personal data and agree to the "
   [:a "privacy policy"]])

(defn tag-input
  [{:keys [title] :as props}]
  [:label.checkbox
   [:input
    (merge
      {:value title
       :name title
       :type "checkbox"}
      props)]
   [:span.checkbox-label title]])

(def tag-service (comp tag-input (partial merge {:name "service"})))
(def tag-money (comp tag-input (partial merge {:type "radio" :name "money"})))

(defn contact-us
  []
  [:form#form {:action web3forms-api :method "POST"}
   [:div.contact-us
    [:input {:type "hidden" :name "access_key" :value web3forms-token}]
    [:input {:type "hidden" :name "subject" :value email-subject}]

    [:span.subtitle "I’m interested in..."]
    [:div.tags-container
     [tag-service
      {:title "Site from scratch"}]
     [tag-service
      {:title "Send Request"}]
     [tag-service
      {:title "UX/UI Design"}]
     [tag-service
      {:title "Development"}]
     [tag-service
      {:title "Branding"}]
     [tag-service
      {:title "Maintenance"}]]

    [:input
     {:placeholder "Name"
      :type "text"
      :name "name"}]
    [:input
     {:placeholder "Email"
      :required true
      :type "email"
      :name "email"}]
    [:textarea
     {:placeholder "Tell us about your project"
      :type "textarea"
      :name "description"}]

    [:span.subtitle "Project budget (USD)"]
    [:div.tags-container
     [tag-money
      {:title "3-10k"}]
     [tag-money
      {:title "10-30k"}]
     [tag-money
      {:title "30-50k"}]
     [tag-money
      {:title "50-100k"}]
     [tag-money
      {:title "100k +"}]]

    [:button {:type "submit"} "Send Request"]
    [:div.privacy privacy-text]]])
