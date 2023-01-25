(ns pages.document
  (:require [reagent.core :as r]
            ["next/document" :refer [Html Head Main NextScript]]))

(defn yandex-metrics
  []
  [:<>
   [:script {:type "text/javascript"
             :dangerouslySetInnerHTML {:__html "(function(m,e,t,r,i,k,a){m[i]=m[i]||function(){(m[i].a=m[i].a||[]).push(arguments)};
      var z = null;m[i].l=1*new Date();
      for (var j = 0; j < document.scripts.length; j++) {if (document.scripts[j].src === r) { return; }}
      k=e.createElement(t),a=e.getElementsByTagName(t)[0],k.async=1,k.src=r,a.parentNode.insertBefore(k,a)})
      (window, document, \"script\", \"https://mc.yandex.ru/metrika/tag.js\", \"ym\");

      ym(90246080, \"init\", {
           clickmap:true,
           trackLinks:true,
           accurateTrackBounce:true,
           webvisor:true
      });"}}]
   [:noscript [:div [:img {:src "https://mc.yandex.ru/watch/90246080" :style {:position "absolute" :left "-9999px"} :alt ""}]]]])

(defn google-metrics
  []
  [:<>
   [:script {:async true :src "https://www.googletagmanager.com/gtag/js?id=G-RL4M281P4S"}]
   [:script {:dangerouslySetInnerHTML {:__html "window.dataLayer = window.dataLayer || [];
    function gtag(){dataLayer.push(arguments);}
    gtag('js', new Date());

    gtag('config', 'G-RL4M281P4S');"}}]])

(defn document-
  []
  [:> Html
   [:> Head]
   [:body
    [yandex-metrics]
    [google-metrics]
    [:> Main]
    [:> NextScript]]])

(def ^:export document
  (r/reactify-component document-))
