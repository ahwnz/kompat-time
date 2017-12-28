/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time

import io.kotlintest.matchers.shouldEqual
import io.kotlintest.specs.StringSpec
import nz.ahw.kompat.time.units.millis
import nz.ahw.kompat.time.units.seconds
import java.time.ZoneId

import java.time.Instant as JInstant

/**
 * Specification for builders of and extensions on [Instant][java.time.Instant]
 */
class InstantSpec: StringSpec({

    "Units Builders" {
        Instant(10.seconds) shouldEqual JInstant.ofEpochSecond(10)
        Instant(20.millis) shouldEqual JInstant.ofEpochMilli(20)
    }

    "atOffset" {
        val result = Instant(30.seconds) atOffset ZoneOffset(13)
        result shouldEqual OffsetDateTime(Instant(30.seconds), ZoneOffset(13))
    }

    "atZone" {
        val result = Instant(40.seconds) atZone ZoneId.of("Europe/London")
        result shouldEqual ZonedDateTime(Instant(40.seconds), ZoneId.of("Europe/London"))
    }
})