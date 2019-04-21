(ns clj101.core)

(defn -main []
  (println "hello world!"))

;; there's your hello world program.

;; we'll play with a couple of things here, so you can get the 
;; idea of how to play with the repl.

;; step 1, use meta+n to set the namespace.  When you do that, the calva
;; repl window will jump up.  it should indicate clj101.core->
;; which is tell you that you are in the coreect namespace
;;

;; the block below is all a comment
(comment

   ;; move your cursor to just after the close ')'
   ;; and press meta+e (evaluate form before cursor)

  ;; or position inside it and use meta+f (evaluate outermost form)

  (+ 10 20)

  (range 10)

  (reduce + (range 1000000))

  (filter odd? (range 30))

  (map #(* 7 %) (range 15))

  (-main))