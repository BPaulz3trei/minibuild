plugins {
    java
    jacoco
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.0")

    testImplementation("org.hamcrest:hamcrest:3.0")
    testImplementation("org.mockito:mockito-core:5.13.0")
}

tasks.test {
    useJUnitPlatform()
}

jacoco {
    toolVersion = "0.8.12"
}