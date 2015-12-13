(ns polymer.platinum
  (:require [miraj.markup :refer [make-tag-fns]]))

;;  (:require [polymer :refer [make-polymer-fns]]))

(alter-meta! *ns* (fn [m] (assoc m :co-ns true)))

(def polymer-platinum-tags
  ["bluetooth"
   "https-redirect"
   "push-messaging"
   "sw"])

(make-tag-fns "platinum-" polymer-platinum-tags nil)
