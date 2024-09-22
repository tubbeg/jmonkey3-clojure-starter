(ns simple-app.core
  (:import [com.jme3.app SimpleApplication]
           [com.jme3.material Material]
           [com.jme3.math ColorRGBA]
           [com.jme3.scene Geometry]
           [com.jme3.scene.shape Box]
           [com.jme3.system AppSettings])
  (:require [util.core :as util])
  (:gen-class
   :name jme3.app.extend.SimpleApp
   :extends com.jme3.app.SimpleApplication
   :prefix "-"
   ; :exposes turned out to be fairly important 
   :exposes {rootNode {:get getN :set setN}
             assetManager {:get getA :set setA}
             }))

 
(def material-path "Common/MatDefs/Misc/Unshaded.j3md")

 (defn -simpleInitApp [this] 
   (let [a (.getA this) 
         n (.getN this)
         b (new Box 1 1 1)
         m (util/create-material a material-path)
         g (util/create-geometry m b)]
     (doto n
       (.attachChild g))))

