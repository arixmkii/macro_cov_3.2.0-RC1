val scala3Version = "3.2.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "coverage_macro_3.2.0-RC1",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "io.circe" %% "circe-generic" % "0.14.2",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

addCommandAlias("cov", ";clean ; coverage; run; coverageReport; coverageOff")
