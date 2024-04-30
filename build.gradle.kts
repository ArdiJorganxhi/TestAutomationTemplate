plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.6.1")
    implementation("org.seleniumhq.selenium:selenium-java:4.13.0")
}

tasks.test {
    useJUnitPlatform()

    if(org.gradle.internal.os.OperatingSystem.current().isWindows) {
        systemProperty("webdriver.chrome.driver", "PATH-TO-YOUR-CHROME-DRIVER")
    }
}