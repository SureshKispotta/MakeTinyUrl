# MakeTinyUrl
Make short url using it avoid using lengthy url while sharing your product url, Image or app url
Copy tinyurl-version-1.0 from lib folder of this project into your app folder lib,
Then use it short your url while sharing.
Setup in Gradel :
android {
    compileSdkVersion 27
    defaultConfig {
        applicationId "com.sk.com.maketinyurl"
        minSdkVersion 15
        targetSdkVersion 27
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
//THIS HAS TO THERE TO LOAD FILE FROM LIB FOLDER
    repositories {
        flatDir {
            dirs 'libs'
        }
    }
}

dependencies {
    implementation fileTree(include: ['*.jar'], dir: 'libs')
    implementation 'com.android.support:appcompat-v7:27.1.1'
    implementation 'com.android.support.constraint:constraint-layout:1.1.2'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
    implementation 'com.android.support:design:27.1.1'
    //THIS  IS LOAD THE LIB TO YOUR PROJECT
    implementation (name: 'tinyurl-version-1.0', ext:'aar')
}


:HOW TO USE THAT  :
 TinyManager.getTinnyUrl() :- CONVERTIGN THE LONG URL IN TINY URL IN ASYNC , SO IT IS NOT GOING TO BLOCK YOUR OTHER TASK
 TinyManager.getTinnyUrl(long_url, new TinyManager.Callback()
        {
            @Override
            public void onSuccess(String url)
            {
              //URL CONTAINS THE TINY URL
            }
            @Override
            public void onError(String error)
            {
      /IF ERROR HAPPEN THEN YOU WILL GET HERE
            }
        });
        
        
        
        
