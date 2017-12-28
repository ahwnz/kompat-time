/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time

import nz.ahw.kompat.time.units.Millis
import nz.ahw.kompat.time.units.Seconds
import java.time.*

// Instant Builders  ---------------------------------------------------------------------------------------------------

fun Instant(millis: Millis): Instant = Instant.ofEpochMilli(millis.value)
fun Instant(seconds: Seconds): Instant = Instant.ofEpochSecond(seconds.value)


// Instant Extensions  -------------------------------------------------------------------------------------------------

infix fun Instant.atOffset(offset: ZoneOffset): OffsetDateTime = this.atOffset(offset)
infix fun Instant.atZone(zone: ZoneId): ZonedDateTime = this.atZone(zone)


