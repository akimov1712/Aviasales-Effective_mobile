plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.jetbrainsKotlinJvm) apply false
    alias(libs.plugins.ksp)
}

android {
    namespace = "ru.topbun.aviasales_effective_mobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.topbun.aviasales_effective_mobile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }
    kotlinOptions {
        jvmTarget = "18"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.dagger)
    ksp(libs.daggerCompiler)

    implementation(libs.navigationUi)
    implementation(libs.navigationFragment)

    implementation(project(":core"))
    implementation(project(":core:android"))
    implementation(project(":core:common"))
    implementation(project(":domain"))
    implementation(project(":aviasales-api"))
    implementation(project(":data"))
    implementation(project(":features"))
    implementation(project(":features:avia-tickets"))
    implementation(project(":features:choice-derection"))
    implementation(project(":features:selected-tour"))
    implementation(project(":features:show-tickets"))
    implementation(project(":features:plug"))
    implementation(project(":features:tabs"))
}