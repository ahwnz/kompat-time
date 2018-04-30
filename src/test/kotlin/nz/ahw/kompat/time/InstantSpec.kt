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
import nz.ahw.kompat.time.units.millis
import nz.ahw.kompat.time.units.seconds
import java.time.ZoneId

import java.time.Instant as JInstant

/**
 * Specification for builders of and extensions on [Instant][java.time.Instant]
 */
class InstantSpec: StringSpec({

    "Units Builders" {
        Instant(10.seconds) shouldBe JInstant.ofEpochSecond(10)
        Instant(20.millis) shouldBe JInstant.ofEpochMilli(20)
    }

    "atOffset" {
        val result = Instant(30.seconds) atOffset ZoneOffset(13)
        result shouldBe OffsetDateTime(Instant(30.seconds), ZoneOffset(13))
    }

    "atZone" {
        val result = Instant(40.seconds) atZone ZoneId.of("Europe/London")
        result shouldBe ZonedDateTime(Instant(40.seconds), ZoneId.of("Europe/London"))
    }
})