object Apps {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val buildToolsVersion = "29.0.2"
}

object Versions {
    const val gradle = "3.5.0"
    const val kotlin = "1.3.50"
    const val appcompat = "1.1.0"
    const val appConstraintLayout = "1.1.3"

    /* test */
    const val junit = "4.12"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.appConstraintLayout}"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
}