#!/bin/sh

(cd '08-gradle-8.5' && ./gradlew help)

(cd '08-gradle-8.5' && ./gradlew help --configuration-cache)

(cd '08-gradle-8.5' && ./gradlew help --no-configuration-cache)
