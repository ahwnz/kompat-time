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

data class Minutes(override val value: Long): TemporalScalar(ChronoUnit.MINUTES) {
    operator fun div(divisor: Long): Minutes = Minutes(this.value / divisor)

    operator fun minus(minutes: Minutes): Minutes = Minutes(this.value - minutes.value)
    operator fun minus(seconds: Seconds): Duration = this.toDuration().minusSeconds(seconds.value)
    operator fun minus(millis: Millis): Duration = this.toDuration().minusMillis(millis.value)
    operator fun minus(nanos: Nanos): Duration = this.toDuration().minusNanos(nanos.value)

    operator fun plus(minutes: Minutes): Minutes = Minutes(this.value + minutes.value)
    operator fun plus(seconds: Seconds): Duration = this.toDuration().plusSeconds(seconds.value)
    operator fun plus(millis: Millis): Duration = this.toDuration().plusMillis(millis.value)
    operator fun plus(nanos: Nanos): Duration = this.toDuration().plusNanos(nanos.value)

    operator fun times(multiplicand: Long): Minutes = Minutes(this.value * multiplicand)

    fun toDuration(): Duration = Duration.ofMinutes(value)
}