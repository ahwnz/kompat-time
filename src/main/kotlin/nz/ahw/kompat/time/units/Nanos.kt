/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time.units

import java.time.Duration
import java.time.temporal.ChronoUnit

data class Nanos(override val value: Long): TemporalScalar(ChronoUnit.NANOS) {
    operator fun div(divisor: Long): Nanos = Nanos(this.value / divisor)

    operator fun minus(nanos: Nanos): Nanos = Nanos(this.value - nanos.value)

    operator fun plus(nanos: Nanos): Nanos = Nanos(this.value + nanos.value)

    operator fun times(multiplicand: Long): Nanos = Nanos(this.value * multiplicand)

    fun toDuration(): Duration = Duration.ofNanos(value)
}