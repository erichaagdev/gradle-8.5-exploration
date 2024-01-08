#!/bin/sh

gradlew() {
  rm -rf gradle_home
  mkdir -p gradle_home/enterprise
  cp ~/.gradle/enterprise/keys.properties gradle_home/enterprise/keys.properties
  cp ~/.gradle/gradle.properties gradle_home/gradle.properties
  ./gradlew -g gradle_home "$@"
}

(cd '01-gradle-8.4' && gradlew help)

(cd '01-gradle-8.5' && gradlew help)
