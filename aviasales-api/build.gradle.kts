plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies{
    implementation(libs.kotlin.coroutines)
    api(libs.retrofit)
    implementation(libs.retrofitGson)
    implementation(libs.okhttpInterceptor)
    implementation(project(":common"))
}