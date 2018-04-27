package com.wajahatkarim3.dbflowmanager_hyperion_demo

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel

import java.util.UUID

@Table(database = AppDB::class)
class SampleTable : BaseModel() {

    @PrimaryKey
    var id: UUID? = null

    @Column
    var name: String? = null

    @Column
    var age: Int = 0

}
