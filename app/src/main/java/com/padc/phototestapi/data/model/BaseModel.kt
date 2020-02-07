package com.padc.phototestapi.data.model

import android.content.Context
import com.padc.phototestapi.network.dataagent.PhotoDataAgent
import com.padc.phototestapi.network.dataagent.RetrofitDataAgent
import com.padc.phototestapi.persistance.PhotoDatabase

abstract class BaseModel{
    protected val dataAgent: PhotoDataAgent = RetrofitDataAgent

    protected lateinit var database: PhotoDatabase

    fun initDatabse(context: Context){
        database = PhotoDatabase.getInstance(context)
    }
}