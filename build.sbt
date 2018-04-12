// Sources from bbb folder are not recognized as sources by IntelliJ IDE
// when opening AAA.scala, symbol BBB is red

// To fix this add content root "bbb" to the module root and mark folder src/main/scala as Sources in the Sources tab

lazy val root = (project in file("aaa")).settings(
  unmanagedSourceDirectories in Compile += (baseDirectory in ThisBuild).value / "bbb" / "src" / "main" / "scala",
)
