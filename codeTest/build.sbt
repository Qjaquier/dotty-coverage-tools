val basePath = System.getProperty("user.dir")


lazy val codeTest = (project in file(".")).
  settings(
    name := "dotty-example-project",
    description := "Example sbt project that compiles using Dotty",
    version := "0.1",
    scalaVersion := "0.8.0-bin-SNAPSHOT",
    //scalaVersion in Compile := "0.8.0-bin-SNAPSHOT",
    //scalaVersion in Test := "2.12.3",
    
    //crossScalaVersions := Seq("2.11.11", "2.12.3","0.8.0-bin-SNAPSHOT"),
    scalacOptions ++= Seq("-coverage", basePath + "\\Report\\scoverage-data")
    //scalacOptions in Test --= Seq("-coveraage", "aaa"),
    //libraryDependencies ++= Seq(
    //"org.scalatest"              % "scalatest_2.11"              % "3.0.0"            % "test"
    //)


  )
    