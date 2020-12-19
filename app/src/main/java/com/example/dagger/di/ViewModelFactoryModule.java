package com.example.dagger.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.dagger.view_models.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);

    //We can achieve same result by method below. Method above is more efficient
//    @Provides
//    static ViewModelProvider.Factory bindFactory(ViewModelProvidersFactory factory){
//        return factory;
//    }


}
