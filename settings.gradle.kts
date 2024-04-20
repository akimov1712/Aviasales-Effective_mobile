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
include(":core")
include(":core:presentation")
include(":core:common")
include(":domain")
include(":aviasales-api")
include(":data")
include(":features")
include(":features:avia-tickets")
include(":features:choice-derection")
include(":features:selected-tour")
include(":features:show-tickets")
include(":features:plug")
include(":features:tabs")
include(":core:theme")
