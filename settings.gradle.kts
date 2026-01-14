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

rootProject.name = "ABDatabaseNative"
include(":abdatabasenative", ":abdatabase", ":abnative")

project(":abdatabase").projectDir = File(rootProject.projectDir, "../ABDatabase/abdatabase")
project(":abnative").projectDir = File(rootProject.projectDir, "../ABNative/abnative")