# MakeTinyUrl
<p>
 Make short url using it avoid using lengthy url while sharing your product url, Image or app url
Copy tinyurl-version-1.0 from lib folder of this project into your app folder lib,
Then use it short your url while sharing.
</p>
</br>
<p>
<h1>Setup in Gradel :</h1>
 </br>
&nbsp;<h5>android</br>{</br>
  </br> &nbsp;compileSdkVersion 27
  </br>  &nbsp;defaultConfig </br>
  &nbsp;&nbsp;&nbsp;{</br>
      &nbsp; applicationId "com.sk.com.maketinyurl"</br>
       &nbsp; minSdkVersion 15</br>
       &nbsp; targetSdkVersion 27</br>
       &nbsp; versionCode 1</br>
       &nbsp; versionName "1.0"</br>
       &nbsp; testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"</br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  }</br>
   &nbsp; buildTypes</br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{</br>
     &nbsp; release</br>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{</br>
          &nbsp;  minifyEnabled false</br>
         &nbsp;   proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'</br>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</br>
  &nbsp&nbsp;}</br>
//THIS HAS TO THERE TO LOAD FILE FROM LIB FOLDER</br>
    repositories {</br>
       &nbsp;&nbsp;&nbsp;&nbsp; flatDir {</br>
            dirs 'libs'</br>
     &nbsp;&nbsp;&nbsp;&nbsp;   }</br>
   &nbsp;&nbsp; }</br>
&nbsp;}</br>
</br>&nbsp;&nbsp;  dependencies {</br>
    implementation 'com.android.support:appcompat-v7:27.1.1'</br>
    implementation 'com.android.support:design:27.1.1'</br>
    //THIS  IS LOAD THE LIB TO YOUR PROJECT</br>
    implementation (name: 'tinyurl-version-1.0', ext:'aar')</br>
}</br>
</p>
</h5>

<p></br>
<h5>:HOW TO USE THAT  :</br>
 TinyManager.getTinnyUrl() :- CONVERTIGN THE LONG URL IN TINY URL IN ASYNC , SO IT IS NOT GOING TO BLOCK YOUR OTHER TASK</br>
 TinyManager.getTinnyUrl(long_url, new TinyManager.Callback()</br>
   &nbsp;&nbsp;&nbsp;{</br>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; @Override</br>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; public void onSuccess(String url)</br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{</br>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    //URL CONTAINS THE TINY URL</br>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;}</br>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  @Override</br>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; public void onError(String error)</br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{</br>
      /IF ERROR HAPPEN THEN YOU WILL GET HERE</br>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  }</br>
    &nbsp;  });</br>
     </p>   
        </h5>
        
        
        
