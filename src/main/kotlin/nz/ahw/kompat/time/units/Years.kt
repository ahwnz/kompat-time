/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time.units

import java.time.Period
import java.time.temporal.ChronoUnit

data class Years(override val value: Long): TemporalScalar(ChronoUnit.YEARS) {
    operator fun div(divisor: Int): Years = Years(this.value / divisor)

    operator fun minus(years: Years): Years = Years(this.value - years.value)
    operator fun minus(months: Months): Period = this.toPeriod().minusMonths(months.value)
    operator fun minus(days: Days): Period = this.toPeriod().minusDays(days.value)

    operator fun plus(years: Years): Years = Years(this.value + years.value)
    operator fun plus(months: Months): Period = this.toPeriod().plusMonths(months.value)
    operator fun plus(days: Days): Period = this.toPeriod().plusDays(days.value)

    operator fun times(multiplicand: Int): Years = Years(this.value * multiplicand)

    fun toPeriod(): Period = Period.ofYears(value.toInt())
}