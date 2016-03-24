name := """minimalscala"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.ensime" %% "java7-file-watcher" % "1.0.0-SNAPSHOT" intransitive () exclude ("commons-logging", "commons-logging")
// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"
