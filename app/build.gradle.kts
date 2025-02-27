apply(plugin = "com.android.application")

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "com.deleter.android.client"
        minSdkVersion(13)
        targetSdkVersion(26)
        externalNativeBuild {
            cmake {
                arguments "-DANDROID_STL=c++_static"
            }
        }
    }
    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android.txt"),))
                    "proguard-rules.pro"
        }
    }
    externalNativeBuild {
        cmake {
            version "3.10.2"
            path "CMakeLists.txt"
        }
    }
}
