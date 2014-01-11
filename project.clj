(defproject jonase/eastwood "0.1.0"
  :description "A Clojure lint tool"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.analyzer "0.1.0-alpha1"]
                 [org.clojure/tools.analyzer.jvm "0.1.0-alpha1"]
                 [org.clojure/tools.namespace "0.2.4"]
                 [org.clojure/tools.reader "0.8.3"]
                 [org.clojars.brenton/google-diff-match-patch "0.1"]
                 [leinjacker "0.4.1"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.macro "0.1.2"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}}
  ;; Note: comment out the following line if you want to do 'lein
  ;; test' and get a Clojure version later than 1.5.1, even if you
  ;; have an explicit org.clojure/clojure in the :dependencies
  :eval-in-leiningen true
  :resource-paths ["resource"])
