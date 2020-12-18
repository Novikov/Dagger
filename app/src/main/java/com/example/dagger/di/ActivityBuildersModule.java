package com.example.dagger.di;

import com.example.dagger.di.auth.AuthViewModulesModule;
import com.example.dagger.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    //Here we declare subcomponent. Look at the ActivityBuildersModule_ContributeAuthActivity in the generated code
    //It's possible create by more complicated way(Look part 14 lesson), but we use android annotations. It's more concise.
    @ContributesAndroidInjector(modules = {AuthViewModulesModule.class})
    abstract AuthActivity contributeAuthActivity();


}
