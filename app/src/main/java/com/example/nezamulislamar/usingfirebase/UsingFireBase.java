package com.example.nezamulislamar.usingfirebase;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Nezamul Islam A R on 10/11/2016.
 */
public class UsingFireBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
