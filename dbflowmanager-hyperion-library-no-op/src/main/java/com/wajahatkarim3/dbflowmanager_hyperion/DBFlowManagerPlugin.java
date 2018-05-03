package com.wajahatkarim3.dbflowmanager_hyperion;

import android.support.annotation.Nullable;

import com.google.auto.service.AutoService;
import com.willowtreeapps.hyperion.plugin.v1.Plugin;
import com.willowtreeapps.hyperion.plugin.v1.PluginModule;

//@AutoService(Plugin.class)
public class DBFlowManagerPlugin extends Plugin {

    @Nullable
    @Override
    public PluginModule createPluginModule() {
        return new DBFlowManagerModule();
    }
}
