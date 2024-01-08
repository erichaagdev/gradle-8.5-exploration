@file:Suppress("UnstableApiUsage")

import org.gradle.kotlin.dsl.support.serviceOf

plugins {
    id("com.gradle.enterprise") version "3.16.1"
}

rootProject.name = "08-gradle-8.5"

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com"

    buildScan {
        publishAlways()

        val buildFeatures = gradle.serviceOf<BuildFeatures>()
        value("buildFeatures.isolatedProjects#active", buildFeatures.isolatedProjects.active.orNull.toString())
        value("buildFeatures.isolatedProjects#requested", buildFeatures.isolatedProjects.requested.orNull.toString())
        value("buildFeatures.configurationCache#active", buildFeatures.configurationCache.active.orNull.toString())
        value("buildFeatures.configurationCache#requested", buildFeatures.configurationCache.requested.orNull.toString())
    }
}
