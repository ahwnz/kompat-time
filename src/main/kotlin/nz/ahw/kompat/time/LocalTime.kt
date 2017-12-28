/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time

import nz.ahw.kompat.time.units.Nanos
import nz.ahw.kompat.time.units.Seconds
import java.time.*

// LocalTime Builders  -------------------------------------------------------------------------------------------------

fun LocalTime(hour: Int, minute: Int): LocalTime = LocalTime.of(hour, minute)

fun LocalTime(hour: Int, minute: Int, second: Int): LocalTime = LocalTime.of(hour, minute, second)

fun LocalTime(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalTime = LocalTime.of(hour, minute, second, nanoOfSecond)

fun LocalTime(seconds: Seconds): LocalTime = LocalTime.ofSecondOfDay(seconds.value)

fun LocalTime(nanos: Nanos): LocalTime = LocalTime.ofNanoOfDay(nanos.value)

// LocalTime Extensions  -----------------------------------------------------------------------------------------------

infix fun LocalTime.atDate(date: LocalDate): LocalDateTime = this.atDate(date)

infix fun LocalTime.atOffset(offset: ZoneOffset): OffsetTime = this.atOffset(offset)

fun LocalTime.with(hour: Int? = null, minute: Int? = null, second: Int? = null, nanoOfSecond: Int? = null): LocalTime {
    var localTime = this
    if(null != hour) localTime = localTime.withHour(hour)
    if(null != minute) localTime = localTime.withMinute(minute)
    if(null != second) localTime = localTime.withSecond(second)
    if(null != nanoOfSecond) localTime = localTime.withNano(nanoOfSecond)
    return localTime
}