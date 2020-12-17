package com.example.dagger.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.dagger.view_models.ViewModelProvidersFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProvidersFactory viewModelProvidersFactory);

    //We can achieve same result by method below. Method above is more efficient
//    @Provides
//    static ViewModelProvider.Factory bindFactory(ViewModelProvidersFactory factory){
//        return factory;
//    }


}
