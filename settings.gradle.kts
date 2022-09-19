import org.apache.tools.ant.DirectoryScanner

pluginManagement {
    repositories {
        mavenCentral()
        maven { setUrl("https://plugins.gradle.org/m2/") }
    }
}
rootProject.name = "thebeyond"

DirectoryScanner.removeDefaultExclude("phaser/*.ts")
