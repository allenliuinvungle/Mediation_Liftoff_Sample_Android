pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            setUrl("https://jitpack.io")
            setUrl("https://android-sdk.is.com/")
        }

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://jitpack.io")
            setUrl("https://android-sdk.is.com/")
        }
    }
}

rootProject.name = "Mediation_Liftoff_Sample_Android"
include(":app")
