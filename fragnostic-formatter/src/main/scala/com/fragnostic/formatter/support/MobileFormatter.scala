package com.fragnostic.formatter.support

trait MobileFormatter {

  private val mobileNumberRegex = """^\d{13}$"""

  def format(mobile: String): String =
    if (mobile.matches(mobileNumberRegex)) {
      s"\u002b${mobile.substring(0, 2)}\u0020\u0028${mobile.substring(2, 4)}\u0029\u0020${mobile.substring(4)}"
    } else {
      mobile
    }

}
