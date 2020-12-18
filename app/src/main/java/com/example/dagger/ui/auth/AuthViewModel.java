package com.example.dagger.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.dagger.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: viewmodel is working");
        if (authApi == null){
            Log.d(TAG, "AuthViewModel: auth api is Null");
        }
        else {
            Log.d(TAG, "AuthViewModel: auth api is NOT NULL");
        }
    }
}
