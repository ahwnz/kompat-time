/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time.units

// Extensions  ---------------------------------------------------------------------------------------------------------

val Int.years get() = Years(this.toLong())

val Int.months get() = Months(this.toLong())

val Int.weeks get() = Days(this * 7.toLong())

val Int.days get() = Days(this.toLong())
val Long.days get() = Days(this)

val Int.hours get() = Hours(this.toLong())
val Long.hours get() = Hours(this)

val Int.minutes get() = Minutes(this.toLong())
val Long.minutes get() = Minutes(this)

val Int.seconds get() = Seconds(this.toLong())
val Long.seconds get() = Seconds(this)

val Int.millis get() = Millis(this.toLong())
val Long.millis get() = Millis(this)

val Int.nanos get() = Nanos(this.toLong())
val Long.nanos get() = Nanos(this)





