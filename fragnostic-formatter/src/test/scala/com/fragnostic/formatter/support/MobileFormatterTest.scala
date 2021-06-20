package com.fragnostic.formatter.support

class MobileFormatterTest extends TestLifeCycleSupport with MobileFormatter {

  describe("Mobile Formatter Test") {

    it("Can Format Mobile With Country Code") {
      "+55 (11) 951976773" should be(format("5511951976773"))
    }

    it("Can Format Mobile Without Country Code") {
      "(11) 951976773" should be(format("11951976773"))
    }

    it("Does Not Format Mobile Too Sort") {
      "76773" should be(format("76773"))
    }

    it("Does Not Format Mobile Too Long") {
      "5511543951976773" should be(format("5511543951976773"))
    }

  }

}
