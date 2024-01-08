plugins {
    java
}

repositories {
    mavenCentral()
}

// Gradle 8.5+
dependencies {
    implementation(versionCatalogs.named("libs").findLibrary("commons-lang").get())
}

// Gradle 8.4 and earlier
val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs")
dependencies {
    implementation(libs.findLibrary("commons-text").get())
}
