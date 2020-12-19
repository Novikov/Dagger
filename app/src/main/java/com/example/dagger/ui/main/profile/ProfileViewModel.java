package com.example.dagger.ui.main.profile;

import android.util.Log;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.dagger.SessionManager;
import com.example.dagger.models.User;
import com.example.dagger.ui.auth.AuthResource;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "DaggerExample";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: viewmodel is ready...");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser(){
        return sessionManager.getAuthUser();
    }
}
