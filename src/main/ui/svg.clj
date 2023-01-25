(ns ui.svg
  (:require [clojure.java.io :as io]))

(defmacro embed-svg
  [svg-file]
  (let [svg (slurp (io/file (str "/Users/wolfface/IdeaProjects/kandk/kandk-website-2.0/website/public"
                                 svg-file)))]
    `[:div {:style {:display "contents"}
            :dangerouslySetInnerHTML {:__html ~(str svg)}}]))

(defmacro js-require
  [src]
  `(list 'js/require ~src))


(defmacro tech-svg-require
  [args]
  `(vector
     ~@(map (fn [k]
              (let [[n ext] (clojure.string/split (name k) #"[.]")]
                [:div
                 {:class-name n
                  :style {:grid-area n}}
                 [:img {:src (js-require
                               (format "../../public/img/tech/%s.%s"
                                       n
                                       (or ext "svg")))}]]))
            args)))

(comment
  (macroexpand-1 (tech-svg-require [:js :ts])))
