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

data class Seconds(override val value: Long): TemporalScalar(ChronoUnit.SECONDS) {
    operator fun div(divisor: Long): Seconds = Seconds(this.value / divisor)

    operator fun minus(seconds: Seconds): Seconds = Seconds(this.value - seconds.value)
    operator fun minus(millis: Millis): Duration = this.toDuration().minusMillis(millis.value)
    operator fun minus(nanos: Nanos): Duration = this.toDuration().minusNanos(nanos.value)

    operator fun plus(seconds: Seconds): Seconds = Seconds(this.value + seconds.value)
    operator fun plus(millis: Millis): Duration = this.toDuration().plusMillis(millis.value)
    operator fun plus(nanos: Nanos): Duration = this.toDuration().plusNanos(nanos.value)

    operator fun times(multiplicand: Long): Seconds = Seconds(this.value * multiplicand)

    fun toDuration(): Duration = Duration.ofSeconds(value)

}