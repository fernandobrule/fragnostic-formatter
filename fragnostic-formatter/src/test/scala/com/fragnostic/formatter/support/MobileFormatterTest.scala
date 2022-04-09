package com.fragnostic.formatter.support

class MobileFormatterTest extends TestLifeCycleSupport with MobileFormatter {

  describe("Mobile Formatter Test") {

    it("Can Format Mobile With Country Code") {
      assertResult("+55 (11) 951976773")(format("5511951976773"))
    }

    it("Can Format Mobile Without Country Code") {
      assertResult("(11) 951976773")(format("11951976773"))
    }

    it("Does Not Format Mobile Too Sort") {
      assertResult("76773")(format("76773"))
    }

    it("Does Not Format Mobile Too Long") {
      assertResult("5511543951976773")(format("5511543951976773"))
    }

  }

}
