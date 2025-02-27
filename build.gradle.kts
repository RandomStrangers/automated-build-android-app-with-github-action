// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
       google()
       jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.4")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
 }
