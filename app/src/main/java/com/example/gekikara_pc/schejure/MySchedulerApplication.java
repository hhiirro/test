package com.example.gekikara_pc.schejure;
import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MySchedulerApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig
                = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfig);
    }

}
