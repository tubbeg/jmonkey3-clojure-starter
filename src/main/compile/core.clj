(ns compile.core)


(defn compile-app-extend []
  (compile 'simple-app.core))

(comment
  
  "Ahead of Time (AOT) compilation is required
   to extend and add properties.

   Edit simple-app.core to fit your needs. Then use
   this function to compile the namspace into a .class
   file. The files are located in ./classes (root directory).
   You may have to restart the REPL sometimes to make it
   work. The files can then be imported just like any other
   java .class file.
   
   You could probably use the 'proxy' function to
   achieve similar results. But gen-class might be easier
   if you want to add properties
   "
  )
;(compile-app-extend)

