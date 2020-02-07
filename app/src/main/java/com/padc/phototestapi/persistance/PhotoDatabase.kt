package com.padc.phototestapi.persistance

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.padc.phototestapi.data.vos.PhotoVO
import com.padc.phototestapi.persistance.dao.PhotoDao
import com.padc.phototestapi.utils.DB_NAME
import retrofit2.Retrofit
@Database(entities = [PhotoVO::class], exportSchema = false, version = 1)
abstract class PhotoDatabase:RoomDatabase(){
    abstract fun photoDao():PhotoDao

    companion object{
        private var instance: PhotoDatabase? = null

        fun getInstance(context: Context): PhotoDatabase{
            if(instance == null){
                instance = Room.databaseBuilder(context, PhotoDatabase::class.java, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance!!
        }
    }
}