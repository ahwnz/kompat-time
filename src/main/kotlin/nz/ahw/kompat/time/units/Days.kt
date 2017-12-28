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
import java.time.Period
import java.time.temporal.ChronoUnit

data class Days(override val value: Long): TemporalScalar(ChronoUnit.DAYS) {
    operator fun div(divisor: Long): Days = Days(this.value / divisor)

    operator fun minus(days: Days): Days = Days(this.value - days.value)
    operator fun minus(hours: Hours): Duration = this.toDuration().minusHours(hours.value)
    operator fun minus(minutes: Minutes): Duration = this.toDuration().minusMinutes(minutes.value)
    operator fun minus(seconds: Seconds): Duration = this.toDuration().minusSeconds(seconds.value)
    operator fun minus(millis: Millis): Duration = this.toDuration().minusMillis(millis.value)
    operator fun minus(nanos: Nanos): Duration = this.toDuration().minusNanos(nanos.value)

    operator fun plus(days: Days): Days = Days(this.value + days.value)
    operator fun plus(hours: Hours): Duration = this.toDuration().plusHours(hours.value)
    operator fun plus(minutes: Minutes): Duration = this.toDuration().plusMinutes(minutes.value)
    operator fun plus(seconds: Seconds): Duration = this.toDuration().plusSeconds(seconds.value)
    operator fun plus(millis: Millis): Duration = this.toDuration().plusMillis(millis.value)
    operator fun plus(nanos: Nanos): Duration = this.toDuration().plusNanos(nanos.value)

    operator fun times(multiplicand: Long): Days = Days(this.value * multiplicand)

    fun toDuration(): Duration = Duration.ofDays(value)
    fun toPeriod(): Period = Period.ofDays(value.toInt())

}