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

// Year Builders  ------------------------------------------------------------------------------------------------------

fun Year(isoYear: Int): Year = Year.of(isoYear)

// Year Extensions  ----------------------------------------------------------------------------------------------------

infix fun Year.at(dayOfYear: Int): LocalDate = this.atDay(dayOfYear)

infix fun Year.at(month: Month): YearMonth = this.atMonth(month)

infix fun Year.at(monthDay: MonthDay): LocalDate = this.atMonthDay(monthDay)
