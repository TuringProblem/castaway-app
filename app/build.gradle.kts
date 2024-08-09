plugins {
    application
    kotlin("jvm") version "1.8.0" // Ensure you're using the correct Kotlin version
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.discord4j:discord4j-core:3.2.3")
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("com.example.MainKt") // The main class for the application
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

