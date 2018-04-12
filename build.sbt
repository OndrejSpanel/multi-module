val commonSettigs = Seq(
  version := "0.1",
  scalaVersion := "2.12.5"
)

lazy val shared = (project in file("p-shared")).settings(
  commonSettigs
)

lazy val jvm = (project in file("p-jvm")).settings(
  commonSettigs
).dependsOn(shared)

lazy val js = (project in file("p-js")).settings(
  commonSettigs
).dependsOn(shared)

lazy val root = (project in file(".")).aggregate(jvm, js)
