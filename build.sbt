ThisBuild / scalaVersion := "2.13.10"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := """sbt-assembly-on-windows""",
    libraryDependencies ++= Seq(
      "io.grpc" % "grpc-netty-shaded" % "1.49.2"
    )
  )