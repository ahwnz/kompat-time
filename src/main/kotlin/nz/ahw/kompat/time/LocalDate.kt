/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time

import nz.ahw.kompat.time.units.Days
import java.time.*
import java.time.chrono.ChronoLocalDate

// LocalDate Builders  -------------------------------------------------------------------------------------------------

fun LocalDate(year: Int, month: Int, dayOfMonth: Int): LocalDate = LocalDate.of(year, month, dayOfMonth)

fun LocalDate(year: Int, month: Month, dayOfMonth: Int): LocalDate = LocalDate.of(year, month, dayOfMonth)

fun LocalDate(year: Int, dayOfYear: Int): LocalDate = LocalDate.ofYearDay(year, dayOfYear)

fun LocalDate(epochDay: Days): LocalDate = LocalDate.ofEpochDay(epochDay.value)


// LocalDate Extensions  -----------------------------------------------------------------------------------------------

infix fun LocalDate.atTime(time: LocalTime): LocalDateTime = this.atTime(time)

infix fun LocalDate.atTime(time: OffsetTime): OffsetDateTime = this.atTime(time)

infix fun LocalDate.until(endDateExclusive: ChronoLocalDate): Period = this.until(endDateExclusive)

fun LocalDate.with(year: Int? = null, month: Month? = null, dayOfMonth: Int? = null, dayOfYear: Int? = null): LocalDate {
    var localDate = this
    if(null != year) localDate = localDate.withYear(year)
    if(null != month) localDate = localDate.withMonth(month.value)
    if(null != dayOfMonth) localDate = localDate.withDayOfMonth(dayOfMonth)
    if(null != dayOfYear) localDate = localDate.withDayOfYear(dayOfYear)
    return localDate
}