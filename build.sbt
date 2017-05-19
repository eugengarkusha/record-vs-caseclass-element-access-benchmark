name := """record-vs-caseclass-element-access-benchmark"""

version := "1.0-SNAPSHOT"


scalaVersion := "2.12.2"

libraryDependencies += "com.chuusai" % "shapeless_2.12" % "2.3.2"

enablePlugins(JmhPlugin)
