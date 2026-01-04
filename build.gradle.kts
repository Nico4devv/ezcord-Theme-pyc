plugins {
    id("org.jetbrains.intellij") version "1.16.0"
    java
}

group = "com.nico4dev"
version = "1.0.0"

repositories {
    mavenCentral()
}

intellij {
    version.set("2023.2")
}

tasks {
    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}