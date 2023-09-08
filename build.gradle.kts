plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:6.17.2")
    testImplementation("io.qameta.allure:allure-selenide:2.24.0")
    testImplementation("io.qameta.allure:allure-junit5:2.24.0")
}

tasks.test {
    useJUnitPlatform()
    maxParallelForks = 6
}