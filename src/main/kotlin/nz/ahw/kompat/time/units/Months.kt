/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time.units

import java.time.Period
import java.time.temporal.ChronoUnit

data class Months(override val value: Long): TemporalScalar(ChronoUnit.MONTHS) {
    operator fun div(divisor: Int): Months = Months(this.value / divisor)

    operator fun minus(months: Months): Months = Months(this.value - months.value)
    operator fun minus(days: Days): Period = this.toPeriod().minusDays(days.value)

    operator fun plus(months: Months): Months = Months(this.value + months.value)
    operator fun plus(days: Days): Period = this.toPeriod().plusDays(days.value)

    operator fun times(multiplicand: Int): Months = Months(this.value * multiplicand)

    fun toPeriod(): Period = Period.ofMonths(value.toInt())
}