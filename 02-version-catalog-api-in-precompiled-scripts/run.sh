#!/bin/sh

cat '02-gradle-8.5/buildSrc/src/main/kotlin/dev.erichaag.java.gradle.kts'

(cd '02-gradle-8.5' && ./gradlew build)
