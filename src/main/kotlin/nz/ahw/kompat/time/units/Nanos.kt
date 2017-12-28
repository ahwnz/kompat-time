/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
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