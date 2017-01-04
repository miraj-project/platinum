(ns polymer.platinum.service-worker
  (:require [miraj.markup :refer [make-resource-fns]]))

(alter-meta! *ns*
             (fn [m] (assoc m
                            :co-ns true
                            :resource-type :polymer
                            :resource-pfx "bower_components")))

(def polymer-platinum-sw-tags
  ; fn-tag,  elt-kw,  elt-uri,  docstring
  [['cache	:platinum-sw-cache "platinum-sw/platinum-sw-cache.html"
    "tag: <platinum-sw-cache>
     uri: platinum-sw/platinum-sw-cache.html"]
   ['elements	:platinum-sw-elements "platinum-sw/platinum-sw-elements.html"
    "tag: <platinum-sw-elements>
     uri: platinum-sw/platinum-sw-elements.html"]
   ['fetch	:platinum-sw-fetch "platinum-sw/platinum-sw-fetch.html"
    "tag: <platinum-sw-fetch>
     uri: platinum-sw/platinum-sw-fetch.html"]
   ['import-script	:platinum-sw-import-script "platinum-sw/platinum-sw-import-script.html"
    "tag: <platinum-sw-import-script>
     uri: platinum-sw/platinum-sw-import-script.html"]
   ['offline-analytics	:platinum-sw-offline-analytics "platinum-sw/platinum-sw-offline-analytics.html"
    "tag: <platinum-sw-offline-analytics>
     uri: platinum-sw/platinum-sw-offline-analytics.html"]
   ['register	:platinum-sw-register "platinum-sw/platinum-sw-register.html"
    "tag: <platinum-sw-register>
     uri: platinum-sw/platinum-sw-register.html"]])

(make-resource-fns :html polymer-platinum-sw-tags)
