package com.wajahatkarim3.dbflowmanager_hyperion_demo;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.wajahatkarim3.dbflowmanager_hyperion.DBFlowManager_Hyperion_Constants;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());

        DBFlowManager_Hyperion_Constants.setDatabaseName(getApplicationContext(), AppDB.class);
    }
}
