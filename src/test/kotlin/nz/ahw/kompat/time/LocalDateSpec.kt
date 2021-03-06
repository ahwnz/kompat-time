/*--------------------------------------------------------*\
**                                                        **
**        kompat-time: Kompatibility for Java Time        **
**        Kotlin Compatibility Project (Kompat)           **
**        Copyright 2017-2018, Alex Westphal              **
**        https://github.com/ahwnz/kompat-time            **
**                                                        **
\*--------------------------------------------------------*/
package nz.ahw.kompat.time

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import nz.ahw.kompat.time.units.days

import java.time.LocalDate as JLocalDate
import java.time.Month

class LocalDateSpec: StringSpec({

    "Builder" {
        LocalDate(2017, 12, 14) shouldBe JLocalDate.of(2017, Month.DECEMBER, 14)
        LocalDate(2017, Month.DECEMBER, 14) shouldBe JLocalDate.of(2017, 12, 14)
        LocalDate(2017, 340) shouldBe JLocalDate.of(2017, 12, 6)
    }

    "Units Builder" {
        LocalDate(17512.days) shouldBe JLocalDate.of(2017, 12, 12)
    }

    "atTime(LocalTime)" {
        val  date = LocalDate(2017, Month.DECEMBER, 14)
        val time = LocalTime(19,20)

        date atTime time shouldBe LocalDateTime(date, time)
    }

    "atTime(OffsetTime)" {
        val  date = LocalDate(2017, Month.DECEMBER, 14)
        val time = LocalTime(19,20)
        val offset = ZoneOffset("+13")

        date atTime OffsetTime(time, offset) shouldBe OffsetDateTime(LocalDateTime(date, time), offset)
    }

    "until" {
        val date1 = LocalDate(2017, Month.DECEMBER, 14)
        val date2 = LocalDate(2018, Month.JUNE, 4)

        date1 until date2 shouldBe java.time.Period.between(date1, date2)
    }

    "with" {
        val date = LocalDate(2017, Month.DECEMBER, 14)
        date.with(year = 2020) shouldBe LocalDate(2020, Month.DECEMBER, 14)
        date.with(month = Month.OCTOBER) shouldBe LocalDate(2017, Month.OCTOBER, 14)
        date.with(dayOfMonth = 24) shouldBe LocalDate(2017, Month.DECEMBER, 24)
        date.with(dayOfYear = 340) shouldBe LocalDate(2017, 340)
    }
})