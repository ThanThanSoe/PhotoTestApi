package com.padc.phototestapi.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "photo")
data class PhotoVO(

    @PrimaryKey
    @SerializedName("id")
    var id: Int,

    @SerializedName("fileName")
    var fileName: String,

    @SerializedName("fileType")
    var fileType: String,

    @SerializedName("data")
    var data: String
)