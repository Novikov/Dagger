package com.example.dagger.ui.main.profile;

import android.util.Log;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "ProfileViewModule";

    @Inject
    public ProfileViewModel() {
        Log.d(TAG, "ProfileViewModel: viewmodel is ready...");
    }


}
