/*---------------------------------------------------------------------*\
**     _  ______                                                       **
**    | |/ /  _ \                KBar Time - Kotlin Time Utilities     **
**    | ' /| |_) | __ _ _ __     Copyright 2017, Alex Westphal         **
**    |  < |  _ < / _` | '__|    https://github.com/ahwnz/kbar-time    **
**    | . \| |_) | (_| | |                                             **
**    |_|\_\____/ \__,_|_|                                             **
\*---------------------------------------------------------------------*/
package nz.ahw.kompat.time.units

import java.time.temporal.Temporal
import java.time.temporal.TemporalAmount
import java.time.temporal.TemporalUnit
import java.time.temporal.UnsupportedTemporalTypeException


abstract class TemporalScalar(private val unit: TemporalUnit): TemporalAmount {
    abstract val value: Long

    override fun addTo(temporal: Temporal): Temporal = temporal.plus(value, unit)

    override fun get(unit: TemporalUnit): Long =
            if(unit == this.unit) value else throw UnsupportedTemporalTypeException("Unsupported unit: $unit")

    override fun getUnits(): MutableList<TemporalUnit> = mutableListOf(unit)

    override fun subtractFrom(temporal: Temporal): Temporal = temporal.minus(value, unit)
}

