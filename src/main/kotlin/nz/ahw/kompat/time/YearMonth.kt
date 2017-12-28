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

// YearMonth Builders  -------------------------------------------------------------------------------------------------

fun YearMonth(year: Int, month: Int): YearMonth = YearMonth.of(year, month)

fun YearMonth(year: Int, month: Month): YearMonth = YearMonth.of(year, month)

// YearMonth Extensions  -----------------------------------------------------------------------------------------------

infix fun YearMonth.at(dayOfMonth: Int): LocalDate = this.atDay(dayOfMonth)

fun YearMonth.with(year: Int? = null, month: Month? = null): YearMonth {
    var yearMonth = this
    if(null != year) yearMonth = yearMonth.withYear(year)
    if(null != month) yearMonth = yearMonth.withMonth(month.value)
    return yearMonth
}
