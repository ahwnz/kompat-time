/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time

import java.time.*

// LocalDateTime Builders  ---------------------------------------------------------------------------------------------

fun LocalDateTime(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int): LocalDateTime =
        LocalDateTime.of(year, month, dayOfMonth, hour, minute)

fun LocalDateTime(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int): LocalDateTime =
        LocalDateTime.of(year, month, dayOfMonth, hour, minute, second)

fun LocalDateTime(year: Int, month: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime =
        LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond)

fun LocalDateTime(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int): LocalDateTime =
        LocalDateTime.of(year, month, dayOfMonth, hour, minute)

fun LocalDateTime(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int): LocalDateTime =
        LocalDateTime.of(year, month, dayOfMonth, hour, minute, second)

fun LocalDateTime(year: Int, month: Month, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime =
        LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond)

fun LocalDateTime(date: LocalDate, time: LocalTime): LocalDateTime = LocalDateTime.of(date, time)

// LocalDateTime Extensions  -------------------------------------------------------------------------------------------

infix fun LocalDateTime.atOffset(offset: ZoneOffset): OffsetDateTime = this.atOffset(offset)

infix fun LocalDateTime.atZone(zone: ZoneId): ZonedDateTime = this.atZone(zone)

fun LocalDateTime.with(year: Int? = null, month: Month? = null, dayOfMonth: Int? = null, dayOfYear: Int? = null,
                       hour: Int? = null, minute: Int? = null, second: Int? = null, nanoOfSecond: Int? = null): LocalDateTime {
    var localDT = this
    if(null != year) localDT = localDT.withYear(year)
    if(null != month) localDT = localDT.withMonth(month.value)
    if(null != dayOfMonth) localDT = localDT.withDayOfMonth(dayOfMonth)
    if(null != dayOfYear) localDT = localDT.withDayOfYear(dayOfYear)
    if(null != hour) localDT = localDT.withHour(hour)
    if(null != minute) localDT = localDT.withMinute(minute)
    if(null != second) localDT = localDT.withSecond(second)
    if(null != nanoOfSecond) localDT = localDT.withNano(nanoOfSecond)
    return localDT
}