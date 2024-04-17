plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
    alias(libs.plugins.ksp)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies{
    implementation(libs.kotlin.coroutines)

    implementation(libs.dagger)
    ksp(libs.daggerCompiler)

    api(project(":domain"))
    api(project(":aviasales-api"))
    implementation(project(":common"))
}