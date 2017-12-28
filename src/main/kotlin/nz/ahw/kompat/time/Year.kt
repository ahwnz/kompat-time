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

// Year Builders  ------------------------------------------------------------------------------------------------------

fun Year(isoYear: Int): Year = Year.of(isoYear)

// Year Extensions  ----------------------------------------------------------------------------------------------------

infix fun Year.at(dayOfYear: Int): LocalDate = this.atDay(dayOfYear)

infix fun Year.at(month: Month): YearMonth = this.atMonth(month)

infix fun Year.at(monthDay: MonthDay): LocalDate = this.atMonthDay(monthDay)
