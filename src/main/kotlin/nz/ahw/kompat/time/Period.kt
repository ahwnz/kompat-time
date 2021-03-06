/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time

import nz.ahw.kompat.time.units.Days
import nz.ahw.kompat.time.units.Months
import nz.ahw.kompat.time.units.Years
import java.time.Period

// Period Builders  ----------------------------------------------------------------------------------------------------


fun Period(years: Long = 0, months: Long = 0, days: Long = 0): Period {
    var period = Period.ZERO
    if(years > 0) period = period.plusYears(years)
    if(months > 0) period = period.plusMonths(months)
    if(days > 0) period = period.plusDays(days)
    return period
}

fun Period(years: Years): Period = Period.ofYears(years.value.toInt())
fun Period(months: Months): Period = Period.ofMonths(months.value.toInt())
fun Period(days: Days): Period = Period.ofDays(days.value.toInt())


// Period Extensions  --------------------------------------------------------------------------------------------------

operator fun Period.times(multiplicand: Int): Period = this.multipliedBy(multiplicand)

operator fun Period.unaryMinus(): Period = this.negated()

fun Period.with(years: Int? = null, months: Int? = null, days: Int? = null): Period {
    var period = this
    if(null != years) period = period.withYears(years)
    if(null != months) period = period.withMonths(months)
    if(null != days) period = period.withDays(days)
    return period
}
infix fun Period.with(years: Years): Period = this.withYears(years.value.toInt())
infix fun Period.with(months: Months): Period = this.withMonths(months.value.toInt())
infix fun Period.with(days: Days): Period = this.withDays(days.value.toInt())

