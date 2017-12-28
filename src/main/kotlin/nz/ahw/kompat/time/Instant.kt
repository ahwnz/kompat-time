/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
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


