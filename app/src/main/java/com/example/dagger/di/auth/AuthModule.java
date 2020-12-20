package com.example.dagger.di.auth;

import com.example.dagger.models.User;
import com.example.dagger.network.auth.AuthApi;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    @AuthScope
    @Provides
    @Named("auth_user")
    static User someUser(){
        return new User();
    }

    @AuthScope
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }
}
