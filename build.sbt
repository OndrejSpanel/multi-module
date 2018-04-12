lazy val root = (project in file("aaa")).settings(
  unmanagedSourceDirectories in Compile += (baseDirectory in ThisBuild).value / "bbb" / "src" / "main" / "scala",
)
