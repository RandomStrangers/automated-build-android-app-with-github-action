apply(plugin = "com.android.application")

android {
    compileSdk = Version(28)

    defaultConfig {
        applicationId = = "com.deleter.android.client"
        minSdk = Version(13)
        targetSdk = Version(26)
        externalNativeBuild {
            cmake {
                arguments "-DANDROID_STL=c++_static"
            }
        }
    }
    buildTypes {
        release {
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
