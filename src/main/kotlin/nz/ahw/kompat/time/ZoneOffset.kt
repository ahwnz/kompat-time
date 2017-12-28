/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time
import java.time.ZoneOffset

// ZoneOffset Builders  ------------------------------------------------------------------------------------------------

fun ZoneOffset(offsetId: String): ZoneOffset = ZoneOffset.of(offsetId)

fun ZoneOffset(hours: Int): ZoneOffset = ZoneOffset.ofHours(hours)

fun ZoneOffset(hours: Int, minutes: Int) = ZoneOffset.ofHoursMinutes(hours, minutes)

fun ZoneOffset(hours: Int, minutes: Int, seconds: Int) = ZoneOffset.ofHoursMinutesSeconds(hours, minutes, seconds)


// ZoneOffset Extensions  ----------------------------------------------------------------------------------------------