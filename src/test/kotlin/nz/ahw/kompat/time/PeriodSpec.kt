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
import nz.ahw.kompat.time.units.months
import nz.ahw.kompat.time.units.years

import java.time.Period as JPeriod

class PeriodSpec: StringSpec({

    "Builder" {
        Period(years = 10) shouldBe JPeriod.ofYears(10)
        Period(months = 20) shouldBe JPeriod.ofMonths(20)
        Period(days = 30) shouldBe JPeriod.ofDays(30)
    }

    "Units Builders" {
        Period(5.years) shouldBe JPeriod.ofYears(5)
        Period(15.months) shouldBe JPeriod.ofMonths(15)
        Period(25.days) shouldBe JPeriod.ofDays(25)
    }

    "minus" {
        Period(10.years) - 5.years shouldBe Period(5.years)
        Period(20.months) - 5.months shouldBe Period(15.months)
        Period(30.days) - 5.days shouldBe Period(25.days)
    }

    "plus" {
        Period(10.years) + 5.years shouldBe Period(15.years)
        Period(20.months) + 5.months shouldBe Period(25.months)
        Period(30.days) + 5.days shouldBe Period(35.days)
    }

    "times" {
        Period(20.days) * 10 shouldBe Period(200.days)
        Period(10.days) * -5 shouldBe Period((-50).days)
    }

    "unaryMinus" {
        -Period(10.years) shouldBe Period((-10).years)
    }

    "with" {
        Period(years = 10, months = 5, days = 10).with(days = 20) shouldBe Period(years = 10, months = 5, days = 20)
    }

    "with units" {
        Period(years = 10, months = 5, days = 10) with 20.days shouldBe Period(years = 10, months = 5, days = 20)
    }
})