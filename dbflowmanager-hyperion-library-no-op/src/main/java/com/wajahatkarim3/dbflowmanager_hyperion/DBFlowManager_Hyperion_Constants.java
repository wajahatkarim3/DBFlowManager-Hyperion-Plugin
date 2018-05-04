package com.wajahatkarim3.dbflowmanager_hyperion;

import android.content.Context;
import android.content.SharedPreferences;

public class DBFlowManager_Hyperion_Constants {

    public final static String HDBFMANAGER_PREF_NAME = "hdbfmanager_lib_prefs";
    public final static String HDBFMANAGER_DB_NAME_KEY = "hdbfmanager_db_name_key";

    public static void setDatabaseName(Context context, Class dbClass)
    {
        // No Op
        //SharedPreferences.Editor editor = context.getSharedPreferences(HDBFMANAGER_PREF_NAME, Context.MODE_PRIVATE).edit();
        //editor.putString(HDBFMANAGER_DB_NAME_KEY, dbClass.getName());
        //editor.commit();
    }

}
