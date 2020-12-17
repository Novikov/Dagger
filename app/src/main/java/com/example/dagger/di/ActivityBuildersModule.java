package com.example.dagger.di;

import com.example.dagger.di.auth.AuthViewModulesModule;
import com.example.dagger.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModulesModule.class})
    abstract AuthActivity contributeAuthActivity();


}
