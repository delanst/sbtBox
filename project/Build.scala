import sbt._
import Keys._

object ProjectBuild extends Build {
  import BuildSettings._
  import Dependencies._

  lazy val sbtBox = Project(id = "sbtBox", base = file("."))
                          .settings(baseSettings: _*)
                          .aggregate(model, service, web)

  lazy val model = project
                      .settings(modelSettings: _*)
                      .settings(libraryDependencies ++= testDependencies)

  lazy val service = project
                      .settings(serviceSettings: _*)
                      .configs(IntegrationTest)
                      .settings(Defaults.itSettings : _*)
                      .settings(flywaySettings: _*)
                      .settings(libraryDependencies ++= integrationDependencies)
                      .settings(libraryDependencies ++= slickDependencies)
                      .settings(libraryDependencies ++= testDependencies)
                      .dependsOn(model)

  lazy val web = project
                  .settings(webSettings: _*)
                  .settings(libraryDependencies ++= testDependencies)
                  .dependsOn(service)

}