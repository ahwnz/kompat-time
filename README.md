kompat-time
=========

A Kotlin compatibility layer for constructing and manipulating Java Time.

[ ![Download](https://api.bintray.com/packages/ahwnz/kompat/kompat-time/images/download.svg) ](https://bintray.com/ahwnz/kompat/kompat-time/_latestVersion)


## Compatibility

kompat-time is built on the Java Time API defined in JSR-310 and implemented in Java 8. Therefore it should only be used
on JVM's with Java >= 8. Sorry no Android or JS targeting.

## Builders

```kotlin
import nz.ahw.kompat.time.*
import nz.ahw.kompat.time.units.*

val ld: LocalDate = LocalDate(2017, Month.DECEMBER, 8) // 2017/12/08
val lt: LocalTime = LocalTime(16, 40) // 16:40
val ldt: LocalDateTime = LocalDateTime(ld, lt) // 2017-12-08T16:40

val p: Period = Period(2.years) // P2Y
val d: Duration = Duration(4.hours) // PT4H

val t: Instant = Instant(150.seconds) // 1970-01-01T00:02:30Z
```

## Extensions

```kotlin
// Arithmetic operations 
val p2: Period = p + 4.months - 3.days // P2Y4M-3D
val d2: Duration = d + 10.minutes // PT4H10M

val ld2: LocalDate = ld + 2.days // 2017/12/10

// Infix Functions
val ldt2: LocalDateTime = ld atTime lt // 2017-12-08T16:40


// With Functions
val ld3: LocalDate = ld.with(month = Month.OCTOBER)

```

## Date Literals

```kotlin
import knz.ahw.kompat.time.literal.dates.*

// DMY (Little Endian)
val date: LocalDate = 8/Nov/2017

// MDY (Middle Endian)
val date: LocalDate = Nov/8/2017

// YMD (Big Endian)
val date: LocalDate = 2017-Nov-8
```



## Maven

Configure to use the kompat repository

```xml
<repository>
    <id>bintray-ahwnz-kompat</id>
    <name>bintray-kompat</name>
    <url>https://dl.bintray.com/ahwnz/kompat</url>
</repository>
```

Add the dependency

```xml
<dependency>
    <groupId>nz.ahwnz.kompat</groupId>
    <artifactId>kompat-time</artifactId>
    <version>{version}</version>
</dependency>
```






