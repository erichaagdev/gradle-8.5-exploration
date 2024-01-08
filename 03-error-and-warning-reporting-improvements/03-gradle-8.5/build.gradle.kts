plugins {
    id("java")
}

// Gradle 8.5+ results in a much nicer deprecation warning
project.configurations.create("customCompileOnly")
project.sourceSets.create("custom")

// Results in a build failure, regardless of Gradle version
//project.sourceSets.create("custom")
//project.configurations.create("customCompileOnly")
