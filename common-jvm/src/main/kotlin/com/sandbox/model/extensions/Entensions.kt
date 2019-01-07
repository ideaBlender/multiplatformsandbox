package com.sandbox.model.extensions

import com.sandbox.model.DateTime
import java.util.*

fun Date.toDateTime(): DateTime {
    val calendar = GregorianCalendar()
    calendar.time = this
    return DateTime(year = calendar.get(Calendar.YEAR), month =calendar.get(Calendar.MONTH), day=calendar.get(Calendar.DAY_OF_MONTH), hour= calendar.get(Calendar.HOUR_OF_DAY), minute = calendar.get(Calendar.MINUTE))
}