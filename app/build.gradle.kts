plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Apps.compileSdk)
    buildToolsVersion(Apps.buildToolsVersion)
    signingConfigs {
        create("release") {
            keyAlias = "androidKey"
            keyPassword = "android"
            storePassword = "android"
        }
    }
    defaultConfig {
        minSdkVersion(Apps.minSdk)
        targetSdkVersion(Apps.targetSdk)
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true
        setProperty("archivesBaseName", "$applicationId-v$versionName($versionCode)")
        resConfigs("en")
        ndk {
            abiFilters("armeabi-v7a", "x86", "arm64-v8a", "x86_64")
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
    }
    flavorDimensions("dimension")
    productFlavors {
        create("live") {
            setDimension("dimension")
        }
        create("internal") {
            setDimension("dimension")
        }
    }
}

dependencies {
    implementation(Libs.kotlin)
    implementation(Libs.appcompat)
    implementation(Libs.constraintLayout)
    testImplementation(TestLibs.junit)
}
