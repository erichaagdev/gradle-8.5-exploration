plugins {
    id("java")
}

// Gradle 8.4 and earlier results in a less clear deprecation warning
project.configurations.create("customCompileOnly")
project.sourceSets.create("custom")

// Results in a build failure, regardless of Gradle version
//project.sourceSets.create("custom")
//project.configurations.create("customCompileOnly")
