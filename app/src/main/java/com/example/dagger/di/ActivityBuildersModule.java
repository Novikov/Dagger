package com.example.dagger.di;

import com.example.dagger.di.auth.AuthModule;
import com.example.dagger.di.auth.AuthScope;
import com.example.dagger.di.auth.AuthViewModulesModule;
import com.example.dagger.di.main.MainFragmentBuildersModule;
import com.example.dagger.di.main.MainModule;
import com.example.dagger.di.main.MainScopoe;
import com.example.dagger.di.main.MainViewModelsModule;
import com.example.dagger.ui.auth.AuthActivity;
import com.example.dagger.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    //Here we declare subcomponent. Look at the ActivityBuildersModule_ContributeAuthActivity in the generated code
    //It's possible create by more complicated way(Look part 14 lesson), but we use android annotations. It's more concise.
    @AuthScope
    @ContributesAndroidInjector(modules = {AuthViewModulesModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

    @MainScopoe
    @ContributesAndroidInjector(modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class})
    abstract MainActivity contributeMainActivity();
}
