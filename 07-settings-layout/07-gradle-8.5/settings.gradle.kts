@file:Suppress("UnstableApiUsage")

plugins {
    id("com.gradle.enterprise") version "3.16.1"
}

rootProject.name = "07-gradle-8.5"

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com"

    buildScan {
        publishAlways()
        background {
            // Gradle 8.5+
            value("Settings.layout.rootDirectory", layout.rootDirectory.asFile.toString())
            value("Settings.layout.rootDirectory - Type", layout.rootDirectory.javaClass.canonicalName)
            value("Settings.layout.settingsDirectory", layout.settingsDirectory.asFile.toString())
            value("Settings.layout.settingsDirectory - Type", layout.settingsDirectory.javaClass.canonicalName)

            // Gradle 8.4 and earlier
            value("Settings.rootDir", rootDir.toString())
            value("Settings.rootDir - Type", rootDir.javaClass.canonicalName)
            value("Settings.settingsDir", settingsDir.toString())
            value("Settings.settingsDir - Type", settingsDir.javaClass.canonicalName)
        }
    }
}
