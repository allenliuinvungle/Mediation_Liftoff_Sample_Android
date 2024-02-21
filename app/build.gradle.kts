plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}





android {
    namespace = "com.example.mediation_liftoff_sample_android"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mediation_liftoff_sample_android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")


    //Admob
    implementation ("com.google.android.gms:play-services-ads:22.6.0")
    implementation ("com.google.ads.mediation:vungle:7.1.0.0")
    implementation ("com.google.android.ads:mediation-test-suite:3.0.0")

    //Ironsource
    implementation ("com.ironsource.sdk:mediationsdk:7.8.0")
    implementation ("com.ironsource.adapters:vungleadapter:4.3.23")
    implementation ("com.vungle:vungle-ads:7.1.0")
    //MAX
    implementation ("com.applovin:applovin-sdk:+")
    implementation ("com.applovin.mediation:vungle-adapter:+")




    // Recommended for SDK to be able to get Android Advertising ID
    implementation ("com.google.android.gms:play-services-basement:17.4.0")
    implementation ("com.google.android.gms:play-services-ads-identifier:17.0.0")
}