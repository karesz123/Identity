plugins {
    id("java")
    id("org.springframework.boot") version "3.2.1"
    id("io.freefair.lombok") version "8.6"
}
apply(plugin = "io.spring.dependency-management")

group = "org.identity"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.bouncycastle:bcprov-jdk18on:1.78.1")
    implementation("org.modelmapper:modelmapper:3.2.0")

    implementation("io.jsonwebtoken:jjwt-api:0.12.6")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.6")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.6")

    implementation("org.liquibase:liquibase-core")
    implementation("com.microsoft.sqlserver:mssql-jdbc:12.6.2.jre11")

    testImplementation(platform("org.junit:junit-bom"))
    testImplementation("org.junit.jupiter:junit-jupiter")

}

tasks.test {
    useJUnitPlatform()
}