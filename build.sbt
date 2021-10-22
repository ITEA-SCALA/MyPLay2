name := "MyPLay2"
 
version := "1.0" 
      
lazy val `myplay2` = (project in file(".")).enablePlugins(PlayScala)

      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.5"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice,
  "com.h2database" % "h2" % "1.4.192"
)
      