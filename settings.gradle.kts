pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Aviasales-Effective_mobile"
include(":app")
include(":domain")
include(":aviasales-api")
include(":data")
include(":features")
include(":features:avia-tickets")
include(":core")
include(":core:android")
include(":core:common")
include(":features:choice-derection")
