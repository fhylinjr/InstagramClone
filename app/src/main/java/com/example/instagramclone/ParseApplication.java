package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        // Register your parse models
        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Sr9a5xz17tSwdYgjcRKOicr4Hs7jhFMwOw0ThpIL")
                .clientKey("B7TFxOJ4yAKuxsPElSPwQTGkcGvZkazY7IXitNWS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
