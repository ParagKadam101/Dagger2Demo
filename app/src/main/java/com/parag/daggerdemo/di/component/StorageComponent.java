package com.parag.daggerdemo.di.component;

import com.parag.daggerdemo.MainActivity;
import com.parag.daggerdemo.di.module.StorageModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = StorageModule.class)
public interface StorageComponent {
    void inject(MainActivity mainActivity);
}
