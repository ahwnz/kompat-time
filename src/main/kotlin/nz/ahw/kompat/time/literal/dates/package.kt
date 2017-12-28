/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time.literal.dates

import java.time.LocalDate
import java.time.Month
import java.time.MonthDay
import java.time.YearMonth

// Starts DD/MMM/YYYY
operator fun Int.div(month: Month): MonthDay = MonthDay.of(month, this)

// Starts MMM/DD/YYYY
operator fun Month.div(dayOfMonth: Int): MonthDay = MonthDay.of(this, dayOfMonth)

operator fun MonthDay.div(year: Int): LocalDate = this.atYear(year)

// Starts YYYY/MMM/DD
operator fun Int.minus(month: Month): YearMonth = YearMonth.of(this, month)

operator fun YearMonth.minus(dayOfMonth: Int): LocalDate = this.atDay(dayOfMonth)


val Jan = Month.JANUARY
val Feb = Month.FEBRUARY
val Mar = Month.MARCH
val Apr = Month.APRIL
val May = Month.MAY
val Jun = Month.JUNE
val Jul = Month.JULY
val Aug = Month.AUGUST
val Sep = Month.SEPTEMBER
val Oct = Month.OCTOBER
val Nov = Month.NOVEMBER
val Dec = Month.DECEMBER
