package com.padc.phototestapi

import android.app.Application
import com.padc.phototestapi.data.model.PhotoListModelImpl

class PhotoApp : Application(){
    override fun onCreate() {
        super.onCreate()
        PhotoListModelImpl.initDatabse(applicationContext)
    }
}