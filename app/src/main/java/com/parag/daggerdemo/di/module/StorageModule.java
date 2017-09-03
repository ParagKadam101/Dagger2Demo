package com.parag.daggerdemo.di.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.parag.daggerdemo.application.MyApplication;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;


@Module
public class StorageModule {
    private final MyApplication mMyApplication;

    public StorageModule(MyApplication myApplication)
    {
        mMyApplication = myApplication;
    }

    @Singleton
    @Provides
    public SharedPreferences provideSharedPreferences()
    {
        return PreferenceManager.getDefaultSharedPreferences(mMyApplication);
    }
}
