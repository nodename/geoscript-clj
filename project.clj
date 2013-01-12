(defproject geoscript "1.0.0-SNAPSHOT"
  :description "Clojure version of the geoscript project"
  :repositories { "Open Source Geospatial Foundation Repository" "http://download.osgeo.org/webdav/geotools/"}
  :url "http://geoscript.org/"
  :main geoscript.core
  :dependencies [[org.clojure/clojure "1.2.1"]
     	         [org.clojure/data.json "0.1.1"]
                 [org.geotools/gt-main "8.5"]
                 [org.geotools/gt-swing "8.5"]                 
                 [org.geotools/gt-epsg-hsql "8.5"]
                 [org.geotools/gt-referencing "8.5"]
                 [org.geotools.jdbc/gt-jdbc-postgis "8.5"] 
                 [org.geotools.jdbc/gt-jdbc-h2 "8.5"]                 
                 [org.geotools/gt-geojson "8.5"]
                 [org.geotools/gt-charts "8.5"]
                 [org.geotools/gt-render "8.5"]
                 [org.geotools/gt-shapefile "8.5"]])
