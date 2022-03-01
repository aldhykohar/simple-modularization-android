/**
 * Created by aldhykohar on 3/1/2022.
 */
const val kotlinVersion = "1.5.31"
const val gradleVersion = "7.0.3"

object AndroidSDK {
    const val compileSdk = 31
    const val buildTools = "29.0.2"
}

object DefaultConfig {
    const val applicationID = "com.example.learn_modularization_android"
    const val minSdk = 21
    const val targetSdk = 31
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object ProguardFile {
    const val textFile = "proguard-android-optimize.txt"
    const val ruleFile = "proguard-rules.pro"
}

object BuildPlugins {

    const val androidGradlePlugin = "com.android.tools.build:gradle:$gradleVersion"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val taskTypeClean = "clean"

    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"

}

object ApplicationLibs {
    private object Versions {
        const val appcompat = "1.4.1"
        const val ktx = "1.7.0"
        const val constraint = "2.1.3"
        const val material = "1.5.0"
    }

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${kotlinVersion}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKTX = "androidx.core:core-ktx:${Versions.ktx}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
}

object TestLibs {
    private object Versions {
        const val junit = "4.12"
        const val extJunit = "1.1.3"
        const val espresso = "3.4.0"
    }

    const val junit = "junit:junit:${Versions.junit}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}