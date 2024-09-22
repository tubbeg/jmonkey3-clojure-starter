(ns game.core
  (:import [com.jme3.app SimpleApplication]
           [com.jme3.material Material]
           [com.jme3.math ColorRGBA]
           [com.jme3.scene Geometry]
           [com.jme3.scene.shape Box] 
           [com.jme3.asset AssetKey]
           [com.jme3.system AppSettings]
           [jme3.app.extend SimpleApp])
  (:require [simple-app.core]))


; 1. Edit simple-app.core to fit your needs
; 2. Compile (AoT) simple-app.core
; 3. Import the class from ./classes directory

(def title "MyAwesomeGame")

(defn make-settings [title]
  (doto (new AppSettings true)
    (.setTitle title)))

(defn run []
  (let [a (new SimpleApp)
        s (make-settings title)]
    (doto a
      (.setSettings s)
      (.start))))

(run)
