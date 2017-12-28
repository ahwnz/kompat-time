/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time

import java.time.Month
import java.time.MonthDay

// Month Builders  -----------------------------------------------------------------------------------------------------

fun Month(month: Int): Month = Month.of(month)

// Month Extensions  ---------------------------------------------------------------------------------------------------

