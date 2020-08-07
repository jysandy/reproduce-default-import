(ns reproduce-default-import.core
  (:require ["react-day-picker" :default DayPicker]
            [reagent.dom :as rdom]))


(defn ui []
  [:div
   [:h2 "Here's a day picker"]
   ;; This blows up because DayPicker is undefined
   [:> DayPicker]])

(defn ^:dev/after-load render []
  (rdom/render ui (js/document.getElementById "app")))

(defn ^:export run [] (render))
