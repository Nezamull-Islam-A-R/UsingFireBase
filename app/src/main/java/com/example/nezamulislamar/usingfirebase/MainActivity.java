package com.example.nezamulislamar.usingfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
    private Button add;
    private Firebase mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        mref = new Firebase("https://usingfirebase-d7c62.firebaseio.com/");

        add = (Button)findViewById(R.id.vButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callFirebase();
            }
        });
    }

    private void callFirebase() {
        Firebase chieldRef = mref.child("Name");
        chieldRef.setValue("Nezamul Islam A R");
    }
}
