plugins {
    id("com.gradle.enterprise") version "3.16.1"
}

rootProject.name = "03-gradle-8.4"

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com"

    buildScan {
        publishAlways()
    }
}
