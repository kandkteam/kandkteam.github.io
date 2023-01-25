(ns ui.honeycomb)

(defn flag-img
  [src]
  [:div.if-not-mobile
   [:img
    {:src src
     :width "362"
     :height "318"}]
   [:img
    {:src src
     :width "260"
     :height "260"}]])

(defn honeycomb
  []
  [:div.honeycomb
   [:div.ibws-fix
    [:div.hexagon
     [:div.hexagontent.flag
      [flag-img (js/require "../../public/img/flag-elagu-eesti.png")]]]
    [:div.hexagon
     [:div.hexagontent.flag
      [flag-img (js/require "../../public/img/flag-glory-to-ukraine.png")]]]
    [:div.hexagon
     [:div.hexagontent.flag
      [flag-img (js/require "../../public/img/flag-france.png")]]]
    [:div.hexagon
     [:div.hexagontent.flag
      [flag-img (js/require "../../public/img/flag-belgium.png")]]]
    [:div.hexagon
     [:div.hexagontent.flag
      [flag-img (js/require "../../public/img/flag-israel.png")]]]
    [:div.hexagon
     [:div.hexagontent.flag
      [flag-img (js/require "../../public/img/flag-usa.png")]]]
    [:div.hexagon
     [:div.hexagontent.flag
      [flag-img (js/require "../../public/img/flag-quatar.png")]]]
    [:div.hexagon
     [:div.hexagontent]]]])

   ;[:div.ibws-fix
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can dream - and not make dreams your master;"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can think - and not make thoughts your aim;"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can meet with Triumph and Disaster"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "And treat those two impostors just the same;"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can bear to hear the truth you've spoken"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "Twisted by knaves to make a trap for fools,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "Or watch the things you gave your life to, broken,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "And stoop and build 'em up with worn-out tools:"]]]
   ;[:div.ibws-fix
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can make one heap of all your winnings"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "And risk it on one turn of pitch-and-toss,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "And lose, and start again at your beginnings"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "And never breathe a word about your loss;"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can force your heart and nerve and sinew"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "To serve your turn long after they are gone,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "And so hold on when there is nothing in you"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "Except the Will which says to them: 'Hold on!'"]]]
   ;[:div.ibws-fix
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can talk with crowds and keep your virtue,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "' Or walk with Kings - nor lose the common touch,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "If neither foes nor loving friends can hurt you,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "If all men count with you, but none too much;"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "If you can fill the unforgiving minute"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "With sixty seconds' worth of distance run,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "Yours is the Earth and everything that's in it,"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "And - which is more - you'll be a Man, my son!"]]]
   ;[:div.ibws-fix
   ; [:div.hexagon
   ;  [:div.hexagontent "IF"]]
   ; [:div.hexagon
   ;  [:div.hexagontent "&mdash; Rudyard Kipling"]]
   ; [:div.hexanone
   ;  [:div.hexagontent]]
   ; [:div.hexagon
   ;  [:div.hexagontent]]
   ; [:div.hexagon
   ;  [:div.hexagontent]]
   ; [:div.hexanone
   ;  [:div.hexagontent]]
   ; [:div.hexagon
   ;  [:div.hexagontent]]
   ; [:div.hexagon
   ;  [:div.hexagontent]]]])
