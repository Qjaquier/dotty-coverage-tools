lazy val Report = project
  .in(file("."))
  .settings(
      scalaVersion := "2.12.4",
    crossScalaVersions := Seq("2.10.7", "2.11.12", "2.12.4", "2.13.0-M3"),
  libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5"
)
