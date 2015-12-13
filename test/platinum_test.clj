(ns platinum-test
  (:require [polymer.platinum :as platinum]))

(println (platinum/bluetooth))

(miraj.markup/serialize :html
 (platinum/https-redirect))

(miraj.markup/serialize :html
 (platinum/push-messaging))

(miraj.markup/serialize :html
 (platinum/sw))
