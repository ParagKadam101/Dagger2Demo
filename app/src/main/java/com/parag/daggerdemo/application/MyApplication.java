package com.parag.daggerdemo.application;

import android.app.Application;

import com.parag.daggerdemo.di.component.DaggerStorageComponent;
import com.parag.daggerdemo.di.component.StorageComponent;
import com.parag.daggerdemo.di.module.StorageModule;


public class MyApplication extends Application {
    StorageComponent mStorageComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mStorageComponent = DaggerStorageComponent.builder().storageModule(new StorageModule(this)).build();
    }

    public StorageComponent getStorageComponent()
    {
        return mStorageComponent;
    }
}
