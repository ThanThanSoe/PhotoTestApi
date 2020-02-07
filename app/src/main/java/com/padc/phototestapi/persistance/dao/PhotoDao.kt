package com.padc.phototestapi.persistance.dao


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.padc.phototestapi.data.vos.PhotoVO
import io.reactivex.Maybe
import io.reactivex.Single
@Dao
interface PhotoDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertPhotos(photos: List<PhotoVO>): Single<LongArray>

    @Query("select * from photo")
    abstract fun getAllPhotosMaybe(): Maybe<List<PhotoVO>>

    @Query("select * from photo")
    abstract fun getAllPhotos(): LiveData<List<PhotoVO>>
}