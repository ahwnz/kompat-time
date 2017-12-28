/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time

import java.time.LocalDate
import java.time.Month
import java.time.MonthDay

// MonthDay Builders  --------------------------------------------------------------------------------------------------

fun MonthDay(month: Int, dayOfMonth: Int): MonthDay = MonthDay.of(month, dayOfMonth)

fun MonthDay(month: Month, dayOfMonth: Int): MonthDay = MonthDay.of(month, dayOfMonth)

// MonthDay Builders  --------------------------------------------------------------------------------------------------

infix fun MonthDay.at(year: Int): LocalDate = this.atYear(year)

fun MonthDay.with(month: Month? = null, dayOfMonth: Int? = null): MonthDay {
    var monthDay = this
    if(null != month) monthDay = monthDay.withMonth(month.value)
    if(null != dayOfMonth) monthDay = monthDay.withDayOfMonth(dayOfMonth)
    return monthDay
}