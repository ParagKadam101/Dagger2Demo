package com.parag.daggerdemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.parag.daggerdemo.application.MyApplication;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication)getApplication()).getStorageComponent().inject(this);
        if(mSharedPreferences != null)
        {
            Log.d("xxx","Successfully injected sharedpreference object");
        }
    }
}
