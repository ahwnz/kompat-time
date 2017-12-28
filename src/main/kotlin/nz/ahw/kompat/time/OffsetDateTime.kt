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

// OffsetDateTime Builders  --------------------------------------------------------------------------------------------

fun OffsetDateTime(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int, offset: ZoneOffset): OffsetDateTime =
        OffsetDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, offset)

fun OffsetDateTime(date: LocalDate, time: LocalTime, offset: ZoneOffset): OffsetDateTime =
        OffsetDateTime.of(date, time, offset)

fun OffsetDateTime(dateTime: LocalDateTime, offset: ZoneOffset): OffsetDateTime =
        OffsetDateTime.of(dateTime, offset)

fun OffsetDateTime(instant: Instant, zone: ZoneId): OffsetDateTime =
        OffsetDateTime.ofInstant(instant, zone)

// OffsetDateTime Extensions  ------------------------------------------------------------------------------------------

fun OffsetDateTime.with(year: Int? = null, month: Month? = null, dayOfMonth: Int? = null, dayOfYear: Int? = null,
                        hour: Int? = null, minute: Int? = null, second: Int? = null, nanoOfSecond: Int? = null): OffsetDateTime {
    var offsetDateTime = this
    if(null != year) offsetDateTime = offsetDateTime.withYear(year)
    if(null != month) offsetDateTime = offsetDateTime.withMonth(month.value)
    if(null != dayOfMonth) offsetDateTime = offsetDateTime.withDayOfMonth(dayOfMonth)
    if(null != dayOfYear) offsetDateTime = offsetDateTime.withDayOfYear(dayOfYear)
    if(null != hour) offsetDateTime = offsetDateTime.withHour(hour)
    if(null != minute) offsetDateTime = offsetDateTime.withMinute(minute)
    if(null != second) offsetDateTime = offsetDateTime.withSecond(second)
    if(null != nanoOfSecond) offsetDateTime = offsetDateTime.withNano(nanoOfSecond)
    return offsetDateTime
}