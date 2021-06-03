package com.fragnostic.formatter.support

import org.scalatest.{ BeforeAndAfterAll, FunSpec, Matchers }
import org.slf4j.{ Logger, LoggerFactory }

import scala.language.postfixOps

trait TestLifeCycleSupport extends FunSpec with Matchers with BeforeAndAfterAll {

  private[this] val logger: Logger = LoggerFactory.getLogger(getClass.getName)

  override def beforeAll(): Unit = {
    //
  }

  override def afterAll(): Unit = {
    //
  }

}
