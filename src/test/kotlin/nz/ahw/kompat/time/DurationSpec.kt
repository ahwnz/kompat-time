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
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import nz.ahw.kompat.time.units.*

import java.time.Duration as JDuration

class DurationSpec: StringSpec({

    "Builder" {
        Duration(days = 10) shouldBe JDuration.ofDays(10)
        Duration(hours = 20) shouldBe JDuration.ofHours(20)
        Duration(minutes = 30) shouldBe JDuration.ofMinutes(30)
        Duration(seconds = 40) shouldBe JDuration.ofSeconds(40)
        Duration(millis = 50) shouldBe JDuration.ofMillis(50)
        Duration(nanos = 60) shouldBe JDuration.ofNanos(60)
    }

    "Units Builders" {
        Duration(5.days) shouldBe JDuration.ofDays(5)
        Duration(15.hours) shouldBe JDuration.ofHours(15)
        Duration(25.minutes) shouldBe JDuration.ofMinutes(25)
        Duration(35.seconds) shouldBe JDuration.ofSeconds(35)
        Duration(45.millis) shouldBe JDuration.ofMillis(45)
        Duration(55.nanos) shouldBe JDuration.ofNanos(55)
    }

    "div" {
        Duration(20.hours) / 10 shouldBe Duration(2.hours)
        Duration(30.hours) / -3 shouldBe Duration((-10).hours)

        shouldThrow<ArithmeticException> {
            Duration(10.seconds) / 0
        }
    }

    "minus" {
        Duration(10.days) - 5.days shouldBe Duration(5.days)
        Duration(20.hours) - 5.hours shouldBe Duration(15.hours)
        Duration(30.minutes) - 5.minutes shouldBe Duration(25.minutes)
        Duration(40.seconds) - 5.seconds shouldBe Duration(35.seconds)
        Duration(50.millis) - 5.millis shouldBe Duration(45.millis)
        Duration(60.nanos) - 5.nanos shouldBe Duration(55.nanos)
    }

    "plus" {
        Duration(10.days) + 5.days shouldBe Duration(15.days)
        Duration(20.hours) + 5.hours shouldBe Duration(25.hours)
        Duration(30.minutes) + 5.minutes shouldBe Duration(35.minutes)
        Duration(40.seconds) + 5.seconds shouldBe Duration(45.seconds)
        Duration(50.millis) + 5.millis shouldBe Duration(55.millis)
        Duration(60.nanos) + 5.nanos shouldBe Duration(65.nanos)
    }

    "times" {
        Duration(20.minutes) * 10 shouldBe Duration(200.minutes)
        Duration(10.minutes) * -5 shouldBe Duration((-50).minutes)
    }

    "unaryMinus" {
        -Duration(10.seconds) shouldBe Duration((-10).seconds)
    }

    "with" {
        Duration(minutes = 10, seconds = 5, nanos = 10).with(seconds = 20) shouldBe Duration(seconds = 20, nanos = 10)
        Duration(seconds = 10, nanos = 20).with(nanos = 30) shouldBe Duration(seconds = 10, nanos = 30)
    }

    "with units" {
        Duration(minutes = 10, seconds = 5, nanos = 10) with 20.seconds shouldBe Duration(seconds = 20, nanos = 10)
        Duration(seconds = 10, nanos = 20) with 30.nanos shouldBe Duration(seconds = 10, nanos = 30)
    }
})