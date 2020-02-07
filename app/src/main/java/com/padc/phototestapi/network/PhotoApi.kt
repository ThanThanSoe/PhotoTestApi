package com.padc.phototestapi.network

import com.padc.phototestapi.data.vos.PhotoVO
import com.padc.phototestapi.utils.GET_PHOTO_DETAIL
import com.padc.phototestapi.utils.GET_PHOTO_LIST
import retrofit2.Call
import retrofit2.http.GET
import io.reactivex.Observable
import retrofit2.http.Path

interface PhotoApi{

    @GET(GET_PHOTO_LIST)
    fun getAllPhotos(): Call<List<PhotoVO>>

    @GET(GET_PHOTO_LIST)
    fun getAllPhotosObservable(): Observable<List<PhotoVO>>

    @GET(GET_PHOTO_DETAIL)
    fun getPhotoDetail(@Path("id") id: Int):Call<PhotoVO>

}