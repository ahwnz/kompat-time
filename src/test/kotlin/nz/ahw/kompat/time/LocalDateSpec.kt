package nz.ahw.kompat.time

import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec
import nz.ahw.kompat.time.units.days

import java.time.LocalDate as JLocalDate
import java.time.Month

class LocalDateSpec: StringSpec({

    "Builder" {
        LocalDate(2017, 12, 14) shouldEqual JLocalDate.of(2017, Month.DECEMBER, 14)
        LocalDate(2017, Month.DECEMBER, 14) shouldEqual JLocalDate.of(2017, 12, 14)
        LocalDate(2017, 340) shouldEqual JLocalDate.of(2017, 12, 6)
    }

    "Units Builder" {
        LocalDate(17512.days) shouldEqual JLocalDate.of(2017, 12, 12)
    }

    "atTime(LocalTime)" {
        val  date = LocalDate(2017, Month.DECEMBER, 14)
        val time = LocalTime(19,20)

        date atTime time shouldEqual LocalDateTime(date, time)
    }

    "atTime(OffsetTime)" {
        val  date = LocalDate(2017, Month.DECEMBER, 14)
        val time = LocalTime(19,20)
        val offset = ZoneOffset("+13")

        date atTime OffsetTime(time, offset) shouldEqual OffsetDateTime(LocalDateTime(date, time), offset)
    }

    "until" {
        val date1 = LocalDate(2017, Month.DECEMBER, 14)
        val date2 = LocalDate(2018, Month.JUNE, 4)

        date1 until date2 shouldEqual java.time.Period.between(date1, date2)
    }

    "with" {
        val date = LocalDate(2017, Month.DECEMBER, 14)
        date.with(year = 2020) shouldEqual LocalDate(2020, Month.DECEMBER, 14)
        date.with(month = Month.OCTOBER) shouldEqual LocalDate(2017, Month.OCTOBER, 14)
        date.with(dayOfMonth = 24) shouldEqual LocalDate(2017, Month.DECEMBER, 24)
        date.with(dayOfYear = 340) shouldEqual LocalDate(2017, 340)
    }
})