(defproject clj101 "0.1.0-SNAPSHOT"
  :description "clj101 - mvp clojure app"
  :url "http://gnurdle.github.com/clj101"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot clj101.core
  :target-path "target/%s"
  :plugins [[lein-ancient "0.6.15"]]
  :source-paths ["src"]
  :profiles {:uberjar {:aot :all}})
