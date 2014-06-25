import sbt._, Keys._

object Build extends Build {
  val root = Project(
    id = "rosedu-workshop",
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      organization := "org.rosedu",
      version := "0.1.0",
      scalaVersion := "2.11.1",
      crossPaths := false,
      offline := true,
      // http://docs.oracle.com/javase/7/docs/technotes/tools/solaris/javac.html#xlintwarnings
      javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation"),
      scalacOptions ++= Seq(
        "-feature",
        "-unchecked",
        "-deprecation",
        "-Yno-adapted-args",
        "-language:implicitConversions",
        "-language:higherKinds"
      ),
      libraryDependencies ++= Seq(
        "org.scalaz"     %% "scalaz-core" % "7.0.6",
        "org.scalatest"  %% "scalatest"   % "2.1.7" % "test"
      )
    )
  )
}
