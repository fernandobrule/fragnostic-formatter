package com.fragnostic.formatter.support

import java.time.{LocalDate, LocalDateTime}
import java.time.format.DateTimeFormatter

trait DatetimeFormatter {

  def format(pattern: String, datetime: String): String = {
    val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern(pattern)
    //LocalDateTime.now().format(dateTimeFormatter)
    val localDate: LocalDate = LocalDate.parse(datetime, dateTimeFormatter)

  }

}
