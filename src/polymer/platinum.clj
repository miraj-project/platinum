(ns polymer.platinum
  (:require [miraj.markup :refer [make-resource-fns]]))

(alter-meta! *ns*
             (fn [m] (assoc m
                            :co-ns true
                            :resource-type :polymer
                            :resource-pfx "bower_components")))

(def polymer-platinum-tags
  ; fn-tag,  elt-kw,  elt-uri,  docstring
  [['bluetooth-device	:platinum-bluetooth-device "platinum-bluetooth/platinum-bluetooth-device.html"
    "tag: <platinum-bluetooth-device>
     uri: platinum-bluetooth/platinum-bluetooth-device.html"]
   ['bluetooth-characteristic :platinum-bluetooth-characteristic
    "platinum-bluetooth/platinum-bluetooth-characteristic.html"
    "tag: <platinum-bluetooth-characteristic>
     uri: platinum-bluetooth/platinum-bluetooth-characteristic.html"]
   ['https-redirect :platinum-https-redirect
    "platinum-htt/platinum-https-redirect.html"
    "tag: <platinum-https-redirect>
     uri: platinum-https-redirect/platinum-https-redirect.html"]
   ['push-messaging :platinum-push-messaging
    "platinum-htt/platinum-push-messaging.html"
    "tag: <platinum-push-messaging>
     uri: platinum-push-messaging/platinum-push-messaging.html"]])

(make-resource-fns :html polymer-platinum-tags)
