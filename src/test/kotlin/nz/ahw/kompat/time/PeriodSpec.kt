/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time

import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec
import nz.ahw.ktime.units.days
import nz.ahw.ktime.units.months
import nz.ahw.ktime.units.years

import java.time.Period as JPeriod

class PeriodSpec: StringSpec({

    "Builder" {
        Period(years = 10) shouldEqual JPeriod.ofYears(10)
        Period(months = 20) shouldEqual JPeriod.ofMonths(20)
        Period(days = 30) shouldEqual JPeriod.ofDays(30)
    }

    "Units Builders" {
        Period(5.years) shouldEqual JPeriod.ofYears(5)
        Period(15.months) shouldEqual JPeriod.ofMonths(15)
        Period(25.days) shouldEqual JPeriod.ofDays(25)
    }

    "minus" {
        Period(10.years) - 5.years shouldEqual Period(5.years)
        Period(20.months) - 5.months shouldEqual Period(15.months)
        Period(30.days) - 5.days shouldEqual Period(25.days)
    }

    "plus" {
        Period(10.years) + 5.years shouldEqual Period(15.years)
        Period(20.months) + 5.months shouldEqual Period(25.months)
        Period(30.days) + 5.days shouldEqual Period(35.days)
    }

    "times" {
        Period(20.days) * 10 shouldEqual Period(200.days)
        Period(10.days) * -5 shouldEqual Period((-50).days)
    }

    "unaryMinus" {
        -Period(10.years) shouldEqual Period((-10).years)
    }

    "with" {
        Period(years = 10, months = 5, days = 10).with(days = 20) shouldBe Period(years = 10, months = 5, days = 20)
    }

    "with units" {
        Period(years = 10, months = 5, days = 10) with 20.days shouldBe Period(years = 10, months = 5, days = 20)
    }
})