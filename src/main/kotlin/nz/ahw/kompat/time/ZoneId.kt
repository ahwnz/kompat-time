/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time
import java.time.ZoneId

// ZoneId Builders  ------------------------------------------------------------------------------------------------

fun ZoneId(zoneId: String): ZoneId = ZoneId.of(zoneId)

// ZoneOffset Extensions  ----------------------------------------------------------------------------------------------