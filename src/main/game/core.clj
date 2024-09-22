(ns game.core
  (:import [com.jme3.app SimpleApplication]
           [com.jme3.material Material]
           [com.jme3.math ColorRGBA]
           [com.jme3.scene Geometry]
           [com.jme3.scene.shape Box] 
           [com.jme3.asset AssetKey]
           [com.jme3.system AppSettings]
           [jme3.app.extend Watermelon])
  (:require [simple-app.core]))

(def title "MyAwesomeGame")

(defn make-settings [title]
  (doto (new AppSettings true)
    (.setTitle title)))

(defn run []
  (let [a (new Watermelon)
        s (make-settings title)]
    (doto a
      (.setSettings s)
      (.start))))



(run)
