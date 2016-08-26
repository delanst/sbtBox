import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "RepoOne" at "https://repo1.maven.org/maven2/",
    "MVNRepository" at "https://mvnrepository.com/",
    "Twitter Maven Repo" at "http://maven.twttr.com/",
    "Finatra Repo" at "http://twitter.github.com/finatra",
    "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/",
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
  )

  lazy val slickDependencies = Seq(
    "postgresql" % "postgresql" % "9.1-901.jdbc4"
  )

  lazy val specs2Version = "3.8.4"
  val testDependencies = Seq(
    "org.specs2" %% "specs2-core" % specs2Version % "test",
    "org.specs2" %% "specs2-junit" % specs2Version % "test",
    "org.specs2" %% "specs2-mock" % specs2Version % "test"
  )

  lazy val integrationDependencies = Seq(
    "org.specs2" %% "specs2-core" % specs2Version % "it",
    "org.specs2" %% "specs2-junit" % specs2Version % "it",
    "org.specs2" %% "specs2-mock" % specs2Version % "it"
  )

  lazy val flywayDependencies = Seq(
    "org.flywaydb" % "flyway-sbt" % "4.0"
  )

}