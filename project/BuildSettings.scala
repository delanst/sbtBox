import sbt._
import Keys._
import com.typesafe.sbteclipse.plugin.EclipsePlugin._
import org.flywaydb.sbt.FlywayPlugin.autoImport._

object BuildSettings {

  lazy val baseSettings = Seq(
    version := "0.1.0-SNAPSHOT",
    organization := "be.sdtech",
    startYear := Some(2016),
    licenses := Seq("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8"),
    scalaVersion := "2.11.8",
    resolvers ++= Dependencies.resolutionRepos,
    EclipseKeys.withSource := true
  )

  lazy val modelSettings = baseSettings ++ Seq(
    version := "0.1.0-SNAPSHOT"
  )

  lazy val serviceSettings = baseSettings ++ Seq(
    version := "0.1.0-SNAPSHOT"
  )

  lazy val webSettings = baseSettings ++ Seq(
    version := "0.1.0-SNAPSHOT"
  )

  /**
    * Add the following to your project (Build.scala) to activate integration test with flyway
    * .configs(IntegrationTest)
    * .settings(Defaults.itSettings : _*)
    * .settings(flywaySettings: _*)
    * .settings(libraryDependencies ++= integrationDependencies)
    */
  lazy val flywaySettings = Seq(
    flywayUrl := "jdbc:postgresql://localhost:5432/db",
    flywayUser := "user",
    flywayPassword := "password",
    flywaySchemas := Seq("schema"),
    flywayBaselineOnMigrate := true,
    flywayLocations := Seq("db/migration")
  )

}