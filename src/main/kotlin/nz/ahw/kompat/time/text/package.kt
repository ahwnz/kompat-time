/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/

package nz.ahw.kompat.time.text

import java.time.*
import java.time.format.DateTimeParseException

/**
 * Parse the string as an [Instant] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of an Instant.
 */
fun String.toInstant(): Instant = Instant.parse(this)

/**
 * Parse the string as an [Instant] and return the result or `null` if the string is not a
 * valid representation of an Instant.
 */
fun String.toInstantOrNull(): Instant? = catchDTPE { Instant.parse(this) }


/**
 * Parse the string as a [LocalDate] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of a LocalDate.
 */
fun String.toLocalDate(): LocalDate = LocalDate.parse(this)

/**
 * Parse the string as a [LocalDate] and return the result or `null` if the string is not a
 * valid representation of a LocalDate.
 */
fun String.toLocalDateOrNull(): LocalDate? = catchDTPE { LocalDate.parse(this) }


/**
 * Parse the string as a [LocalDateTime] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of a LocalDateTime.
 */
fun String.toLocalDateTime(): LocalDate = LocalDate.parse(this)

/**
 * Parse the string as a [LocalDateTime] and return the result or `null` if the string is not a
 * valid representation of a LocalDateTime.
 */
fun String.toLocalDateTimeOrNull(): LocalDateTime? = catchDTPE { LocalDateTime.parse(this) }


/**
 * Parse the string as a [LocalTime] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of a LocalTime.
 */
fun String.toLocalTime(): LocalTime = LocalTime.parse(this)

/**
 * Parse the string as a [LocalTime] and return the result or `null` if the string is not a
 * valid representation of a LocalTime.
 */
fun String.toLocalTimeOrNull(): LocalTime? = catchDTPE { LocalTime.parse(this) }


/**
 * Parse the string as a [MonthDay] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of a MonthDay.
 */
fun String.toMonthDay(): MonthDay = MonthDay.parse(this)

/**
 * Parse the string as a [MonthDay] and return the result or `null` if the string is not a
 * valid representation of a MonthDay.
 */
fun String.toMonthDayOrNull(): MonthDay? = catchDTPE { MonthDay.parse(this) }


/**
 * Parse the string as an [OffsetDateTime] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of an OffsetDateTime.
 */
fun String.toOffsetDateTime(): OffsetDateTime = OffsetDateTime.parse(this)

/**
 * Parse the string as an [OffsetDateTime] and return the result or `null` if the string is not a
 * valid representation of an OffsetDateTime.
 */
fun String.toOffsetDateTimeOrNull(): OffsetDateTime? = catchDTPE { OffsetDateTime.parse(this) }


/**
 * Parse the string as an [OffsetTime] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of an OffsetTime.
 */
fun String.toOffsetTime(): OffsetTime = OffsetTime.parse(this)

/**
 * Parse the string as an [OffsetTime] and return the result or `null` if the string is not a
 * valid representation of an OffsetTime.
 */
fun String.toOffsetTimeOrNull(): OffsetTime? = catchDTPE { OffsetTime.parse(this) }


/**
 * Parse the string as a [Year] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of a Year.
 */
fun String.toYear(): Year = Year.parse(this)

/**
 * Parse the string as an [Year] and return the result or `null` if the string is not a
 * valid representation of a Year.
 */
fun String.toYearOrNull(): Year? = catchDTPE { Year.parse(this) }


/**
 * Parse the string as a [YearMonth] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of a YearMonth.
 */
fun String.toYearMonth(): YearMonth = YearMonth.parse(this)

/**
 * Parse the string as an [YearMonth] and return the result or `null` if the string is not a
 * valid representation of a YearMonth.
 */
fun String.toYearMonthOrNull(): YearMonth? = catchDTPE { YearMonth.parse(this) }


/**
 * Parse the string as a [ZonedDateTime] and return the result
 * @throws DateTimeParseException If the string is not a valid representation of a ZonedDateTime.
 */
fun String.toZonedDateTime(): ZonedDateTime = ZonedDateTime.parse(this)

/**
 * Parse the string as an [ZonedDateTime] and return the result or `null` if the string is not a
 * valid representation of a ZonedDateTime.
 */
fun String.toZonedDateTimeOrNull(): ZonedDateTime? = catchDTPE { ZonedDateTime.parse(this) }


/**
 * Convert a [DateTimeParseException] to a null return.
 */
private inline fun <T> catchDTPE(f: () -> T): T? = try { f() } catch(ex: DateTimeParseException) { null }