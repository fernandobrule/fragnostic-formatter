import sbt._

object Dependencies {

  lazy val logbackClassic             = "ch.qos.logback"        % "logback-classic"                % "1.3.0-alpha12" % "runtime"
  lazy val slf4jApi                   = "org.slf4j"             % "slf4j-api"                      % "2.0.0-alpha5"
  lazy val scalatestFunSpec           = "org.scalatest"        %% "scalatest-funspec"              % "3.3.0-SNAP3" % Test

}
