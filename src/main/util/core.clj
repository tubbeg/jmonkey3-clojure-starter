(ns util.core
  (:import [com.jme3.material Material]
           [com.jme3.math ColorRGBA]
           [com.jme3.scene Geometry]))

(def blue (. ColorRGBA Blue))


(defn create-material [a path]
  (doto (new Material a path)
    (.setColor "Color" blue)))

(defn create-geometry [material box]
  (doto (new Geometry "Box" box)
    (.setMaterial material)))