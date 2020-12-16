package com.example.dagger.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    //Here we put everything which wont change entire life of our application
    //Always use static methods. It's more efficient.

    @Provides
    static String someString(){
        return "This is a test string";
    }

    @Provides
    static boolean getApp(Application application){ //We can use this parameter because we provide Application inside appcomponent
        return application==null;
    }
}
