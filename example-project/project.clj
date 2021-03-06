(defproject example-project "0.1.0"
  :description "Migratus Leiningen plugin example project"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [mysql/mysql-connector-java "5.1.18"]
                 [migratus "0.6.0"]]
  :plugins [[migratus-lein "0.1.0"]]
  :migratus {:store :database
             :migration-dir "migrations/"
             :db {:classname "com.mysql.jdbc.Driver"
                  :subprotocol "mysql"
                  :subname "//localhost/migratus"
                  :user "root"
                  :password ""}})
