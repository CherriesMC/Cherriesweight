plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "cherriesweight"

include("cherriesweight-core", "paperweight-lib", "cherriesweight-userdev")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
