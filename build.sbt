name := "slick-h2-db"

version := "3.2"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick"           % "3.2.0",
  "com.h2database"      % "h2"              % "1.4.185",
  "ch.qos.logback"      % "logback-classic" % "1.1.2"
)
