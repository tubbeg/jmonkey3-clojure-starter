(ns simple-app.core
  (:import [com.jme3.app SimpleApplication]
           [com.jme3.material Material]
           [com.jme3.math ColorRGBA]
           [com.jme3.scene Geometry]
           [com.jme3.scene.shape Box]
           [com.jme3.system AppSettings])
  (:gen-class
   :name jme3.app.extend.Watermelon
   :extends com.jme3.app.SimpleApplication
   :prefix "-"
   :exposes {rootNode {:get getN :set setN}
             assetManager {:get getA :set setA}
             ;settings {:get getS :set setS}
             }))

(def blue (. ColorRGBA Blue))

(def material-path "Common/MatDefs/Misc/Unshaded.j3md")

(defn create-material [a path]
  (doto (new Material a path)
    (.setColor "Color" blue)))

(defn create-geometry [material box]
  (doto (new Geometry "Box" box)
    (.setMaterial material)))

(comment (defn -simpleInitApp [this]
    (doto (.getS this)
      (println "Setting is: "))))

 (defn -simpleInitApp [this]
   (println "Tryign suåper else")
  (let [a (.getA this) 
        n (.getN this)
        b (new Box 1 1 1)
        m (create-material a material-path)
        g (create-geometry m b)]
    (doto n
     (.attachChild g))))

