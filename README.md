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
</t><h5>android</br>{</br>
  </br>  </t>compileSdkVersion 27
  </br>  </t>defaultConfig </br>{</br>
       </t> applicationId "com.sk.com.maketinyurl"</br>
       </t> minSdkVersion 15</br>
       </t> targetSdkVersion 27</br>
       </t> versionCode 1</br>
       </t> versionName "1.0"</br>
       </t> testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"</br>
  </t>  }</br>
   </t> buildTypes {</br>
     </t>   release {</br>
          </t>  minifyEnabled false</br>
         </t>   proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'</br>
      </t> </t> }</br>
  </t> </t> }</br>
//THIS HAS TO THERE TO LOAD FILE FROM LIB FOLDER</br>
    repositories {</br>
        flatDir {</br>
            dirs 'libs'</br>
        }</br>
    }</br>
}</br>
dependencies {</br>
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
        {</br>
            @Override</br>
            public void onSuccess(String url)</br>
            {</br>
              //URL CONTAINS THE TINY URL</br>
            }</br>
            @Override</br>
            public void onError(String error)</br>
            {</br>
      /IF ERROR HAPPEN THEN YOU WILL GET HERE</br>
            }</br>
        });</br>
     </p>   
        </h5>
        
        
        
