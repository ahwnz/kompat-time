/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time

import nz.ahw.ktime.units.*
import java.time.Duration

// Duration Builders  --------------------------------------------------------------------------------------------------

fun Duration(days: Long = 0, hours: Long = 0, minutes: Long = 0, seconds: Long = 0, millis: Long = 0, nanos: Long = 0): Duration {
    var duration = Duration.ZERO
    if(days > 0) duration = duration.plusDays(days)
    if(hours > 0) duration = duration.plusHours(hours)
    if(minutes > 0) duration = duration.plusMinutes(minutes)
    if(seconds > 0) duration = duration.plusSeconds(seconds)
    if(millis > 0) duration = duration.plusMillis(millis)
    if(nanos > 0) duration = duration.plusNanos(nanos)
    return duration
}

fun Duration(days: Days): Duration = Duration.ofDays(days.value)
fun Duration(hours: Hours): Duration = Duration.ofHours(hours.value)
fun Duration(minutes: Minutes): Duration = Duration.ofMinutes(minutes.value)
fun Duration(seconds: Seconds): Duration = Duration.ofSeconds(seconds.value)
fun Duration(millis: Millis): Duration = Duration.ofMillis(millis.value)
fun Duration(nanos: Nanos): Duration = Duration.ofNanos(nanos.value)


// Duration Extensions  ------------------------------------------------------------------------------------------------

operator fun Duration.div(divisor: Long): Duration = this.dividedBy(divisor)

operator fun Duration.minus(days: Days): Duration = this.minusDays(days.value)
operator fun Duration.minus(hours: Hours): Duration = this.minusHours(hours.value)
operator fun Duration.minus(minutes: Minutes): Duration = this.minusMinutes(minutes.value)
operator fun Duration.minus(seconds: Seconds): Duration = this.minusSeconds(seconds.value)
operator fun Duration.minus(millis: Millis): Duration = this.minusMillis(millis.value)
operator fun Duration.minus(nanos: Nanos): Duration = this.minusNanos(nanos.value)

operator fun Duration.plus(days: Days): Duration = this.plusDays(days.value)
operator fun Duration.plus(hours: Hours): Duration = this.plusHours(hours.value)
operator fun Duration.plus(minutes: Minutes): Duration = this.plusMinutes(minutes.value)
operator fun Duration.plus(seconds: Seconds): Duration = this.plusSeconds(seconds.value)
operator fun Duration.plus(millis: Millis): Duration = this.plusMillis(millis.value)
operator fun Duration.plus(nanos: Nanos): Duration = this.plusNanos(nanos.value)

operator fun Duration.times(multiplicand: Long): Duration = this.multipliedBy(multiplicand)

operator fun Duration.unaryMinus(): Duration = this.negated()

fun Duration.with(seconds: Long? = null, nanos: Int? = null): Duration {
    var duration = this
    if(null != seconds) duration = duration.withSeconds(seconds)
    if(null != nanos) duration = duration.withNanos(nanos)
    return duration
}
infix fun Duration.with(seconds: Seconds): Duration = this.withSeconds(seconds.value)
infix fun Duration.with(nanos: Nanos): Duration = this.withNanos(nanos.value.toInt())


