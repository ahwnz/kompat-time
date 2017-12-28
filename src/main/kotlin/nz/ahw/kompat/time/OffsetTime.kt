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

// OffsetTime Builders  ------------------------------------------------------------------------------------------------

fun OffsetTime(hour: Int, minute: Int, second: Int, nanoOfSecond: Int, offset: ZoneOffset): OffsetTime =
        OffsetTime.of(hour, minute, second, nanoOfSecond, offset)

fun OffsetTime(time: LocalTime, offset: ZoneOffset): OffsetTime =
        OffsetTime.of(time, offset)

fun OffsetTime(instant: Instant, zone: ZoneId): OffsetTime =
        OffsetTime.ofInstant(instant, zone)

// OffsetTime Builders  ------------------------------------------------------------------------------------------------

infix fun OffsetTime.atDate(date: LocalDate): OffsetDateTime = this.atDate(date)

fun OffsetTime.with(hour: Int? = null, minute: Int? = null, second: Int? = null, nanoOfSecond: Int? = null): OffsetTime {
    var offsetTime = this
    if(null != hour) offsetTime = offsetTime.withHour(hour)
    if(null != minute) offsetTime = offsetTime.withMinute(minute)
    if(null != second) offsetTime = offsetTime.withSecond(second)
    if(null != nanoOfSecond) offsetTime = offsetTime.withNano(nanoOfSecond)
    return offsetTime
}