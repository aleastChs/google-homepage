enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

name := "Homepage"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.japgolly.scalacss" %%% "core" % "0.5.1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "com.lihaoyi" %%% "scalatags" % "0.6.2",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
)

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"