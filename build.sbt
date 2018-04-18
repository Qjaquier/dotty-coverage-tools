lazy val root = (project in file("."))
  .aggregate(codeTest, Report)

lazy val codeTest = (project in file("codeTest"))

lazy val Report = (project in file("Report"))