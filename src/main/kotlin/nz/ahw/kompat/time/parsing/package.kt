/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time.parsing

import java.time.*
import java.time.chrono.IsoEra
import java.time.format.DateTimeParseException
import java.time.temporal.TemporalAccessor

// Duration Parsers  ---------------------------------------------------------------------------------------------------

fun CharSequence.parseDuration(): Duration = Duration.parse(this)

fun CharSequence.parseDurationOrNull(): Duration? = catchDTPE { Duration.parse(this) }


// Period Parsers  -----------------------------------------------------------------------------------------------------

fun CharSequence.parsePeriod(): Period = Period.parse(this)
fun CharSequence.parsePeriodOrNull(): Period? = catchDTPE { Period.parse(this) }


// TemporalAccessor Parsers  -------------------------------------------------------------------------------------------

inline fun <reified T: TemporalAccessor> CharSequence.parse(): T = when(T::class) {
    DayOfWeek::class -> DayOfWeek.valueOf(this.toString()) as T
    Instant::class -> Instant.parse(this) as T
    IsoEra::class -> IsoEra.valueOf(this.toString()) as T
    LocalDate::class -> LocalDate.parse(this) as T
    LocalDateTime::class -> LocalDateTime.parse(this) as T
    LocalTime::class -> LocalTime.parse(this) as T
    Month::class -> Month.valueOf(this.toString()) as T
    MonthDay::class -> MonthDay.parse(this) as T
    OffsetDateTime::class -> OffsetDateTime.parse(this) as T
    OffsetTime::class -> OffsetTime.parse(this) as T
    Year::class -> Year.parse(this) as T
    YearMonth::class -> YearMonth.parse(this) as T
    ZonedDateTime::class -> ZonedDateTime.parse(this) as T
    ZoneOffset::class -> ZoneOffset.of(this.toString()) as T
    else -> throw UnsupportedOperationException("parse is unsupported for ${T::class.java.name}")
}

inline fun <reified T: TemporalAccessor> CharSequence.parseOrNull(): T? =
        try { parse() }
        catch(ex: DateTimeException) { null }
        catch(ex: IllegalArgumentException) { null }



private fun <T> catchDTPE(f: () -> T): T? = try { f() } catch(ex: DateTimeParseException) { null }