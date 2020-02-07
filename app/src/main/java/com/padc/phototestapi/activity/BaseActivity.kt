package com.padc.phototestapi.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padc.phototestapi.data.model.PhotoListModel
import com.padc.phototestapi.data.model.PhotoListModelImpl

abstract class BaseActivity: AppCompatActivity(){

    protected lateinit var model: PhotoListModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = PhotoListModelImpl
    }
}