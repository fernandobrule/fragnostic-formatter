package com.fragnostic.formatter.support

class MobileFormatterTest extends TestLifeCycleSupport with MobileFormatter {

  describe("Mobile Formatter Test") {

    it("Can Format") {
      "+55 (11) 951976773" should be(format("5511951976773"))
    }

  }

}
