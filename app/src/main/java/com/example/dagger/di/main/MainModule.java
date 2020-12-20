package com.example.dagger.di.main;

import com.example.dagger.network.main.MainApi;
import com.example.dagger.ui.main.posts.PostRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }

    @Provides
    static PostRecyclerAdapter providesAdapter(){
        return new PostRecyclerAdapter();
    }
}
