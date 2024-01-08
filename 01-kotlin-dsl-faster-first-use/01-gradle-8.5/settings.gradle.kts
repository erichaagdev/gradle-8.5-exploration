plugins {
    id("com.gradle.enterprise") version "3.16.1"
}

rootProject.name = "01-gradle-8.5"

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com"

    buildScan {
        publishAlways()
    }
}
