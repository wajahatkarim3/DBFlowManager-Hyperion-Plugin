package com.wajahatkarim3.dbflowmanager_hyperion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.wajahatkarim3.dbflowmanager.DBFlowManagerActivity;
import com.willowtreeapps.hyperion.plugin.v1.PluginModule;

public class DBFlowManagerModule extends PluginModule {

    @Nullable
    @Override
    public View createPluginView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup parent)
    {
        View view = layoutInflater.inflate(R.layout.hdbfmanager_item_plugin_layout, parent, false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Context context = v.getContext();
                String dbName = context.getSharedPreferences(
                        DBFlowManager_Hyperion_Constants.HDBFMANAGER_PREF_NAME, Context.MODE_PRIVATE)
                        .getString(DBFlowManager_Hyperion_Constants.HDBFMANAGER_DB_NAME_KEY, null);

                if (dbName != null)
                {
                    try {
                        DBFlowManagerActivity.launchDatabaseManager(context, Class.forName(dbName));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        Toast.makeText(context, "Invalid Database Name", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(context, "No Database Found!", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
