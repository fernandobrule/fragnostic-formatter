package com.fragnostic.formatter.support

trait MobileFormatter {

  // 5511951976773 => +55 (11) 951976773
  private val mobileNumberWithCountryCodeRegex = """^\d{13}$"""
  // 11951976773 => (11) 951976773
  private val mobileNumberWithoutCountryCodeRegex = """^\d{11}$"""

  def format(mobile: String): String =
    if (mobile.matches(mobileNumberWithCountryCodeRegex)) {
      s"\u002b${mobile.substring(0, 2)}\u0020\u0028${mobile.substring(2, 4)}\u0029\u0020${mobile.substring(4)}"
    } else if (mobile.matches(mobileNumberWithoutCountryCodeRegex)) {
      s"\u0028${mobile.substring(0, 2)}\u0029\u0020${mobile.substring(2)}"
    } else {
      mobile
    }

}
