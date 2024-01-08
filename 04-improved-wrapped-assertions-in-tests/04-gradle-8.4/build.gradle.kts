@file:Suppress("UnstableApiUsage")

plugins {
    id("java")
    id("jvm-test-suite")
}

repositories {
    mavenCentral()
}

val test by testing.suites.getting(JvmTestSuite::class) {
    useJUnitJupiter()
}
