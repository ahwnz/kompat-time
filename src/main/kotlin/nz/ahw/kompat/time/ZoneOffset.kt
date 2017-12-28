/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time
import java.time.ZoneOffset

// ZoneOffset Builders  ------------------------------------------------------------------------------------------------

fun ZoneOffset(offsetId: String): ZoneOffset = ZoneOffset.of(offsetId)

fun ZoneOffset(hours: Int): ZoneOffset = ZoneOffset.ofHours(hours)

fun ZoneOffset(hours: Int, minutes: Int) = ZoneOffset.ofHoursMinutes(hours, minutes)

fun ZoneOffset(hours: Int, minutes: Int, seconds: Int) = ZoneOffset.ofHoursMinutesSeconds(hours, minutes, seconds)


// ZoneOffset Extensions  ----------------------------------------------------------------------------------------------