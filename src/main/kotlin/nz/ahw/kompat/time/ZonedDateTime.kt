/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time

import java.time.*

// ZonedDateTime Builders  ---------------------------------------------------------------------------------------------

fun ZonedDateTime(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, zone: ZoneId): ZonedDateTime =
        ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone)

fun ZonedDateTime(date: LocalDate, time: LocalTime, zone: ZoneId): ZonedDateTime =
        ZonedDateTime.of(date, time, zone)

fun ZonedDateTime(localDateTime: LocalDateTime, zone: ZoneId): ZonedDateTime =
        ZonedDateTime.of(localDateTime, zone)

fun ZonedDateTime(instant: Instant, zone: ZoneId): ZonedDateTime =
        ZonedDateTime.ofInstant(instant, zone)

// ZonedDateTime Extensions  -------------------------------------------------------------------------------------------

fun ZonedDateTime.with(year: Int? = null, month: Month? = null, dayOfMonth: Int? = null, dayOfYear: Int? = null,
                        hour: Int? = null, minute: Int? = null, second: Int? = null, nanoOfSecond: Int? = null): ZonedDateTime {
    var zonedDateTime = this
    if(null != year) zonedDateTime = zonedDateTime.withYear(year)
    if(null != month) zonedDateTime = zonedDateTime.withMonth(month.value)
    if(null != dayOfMonth) zonedDateTime = zonedDateTime.withDayOfMonth(dayOfMonth)
    if(null != dayOfYear) zonedDateTime = zonedDateTime.withDayOfYear(dayOfYear)
    if(null != hour) zonedDateTime = zonedDateTime.withHour(hour)
    if(null != minute) zonedDateTime = zonedDateTime.withMinute(minute)
    if(null != second) zonedDateTime = zonedDateTime.withSecond(second)
    if(null != nanoOfSecond) zonedDateTime = zonedDateTime.withNano(nanoOfSecond)
    return zonedDateTime
}