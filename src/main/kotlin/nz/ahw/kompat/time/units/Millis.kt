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

data class Millis(override val value: Long): TemporalScalar(ChronoUnit.MILLIS) {
    operator fun div(divisor: Long): Millis = Millis(this.value / divisor)

    operator fun minus(millis: Millis): Millis = Millis(this.value - millis.value)
    operator fun minus(nanos: Nanos): Duration = this.toDuration().minusNanos(nanos.value)

    operator fun plus(millis: Millis): Millis = Millis(this.value + millis.value)
    operator fun plus(nanos: Nanos): Duration = this.toDuration().plusNanos(nanos.value)

    operator fun times(multiplicand: Long): Millis = Millis(this.value * multiplicand)

    fun toDuration(): Duration = Duration.ofMillis(value)

}