package com.wajahatkarim3.dbflowmanager_hyperion_demo;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import java.util.UUID;

@Table(database = AppDB.class)
public class SampleTable {

    @PrimaryKey
    UUID id;

    @Column
    String name;

    @Column
    int age;

}
