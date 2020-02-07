package com.padc.phototestapi.network.dataagent

import com.padc.phototestapi.data.vos.PhotoVO
import io.reactivex.Observable

interface PhotoDataAgent{
    fun getPhotos(onSuccess: (List<PhotoVO>)->Unit, onFailure: (String) -> Unit)

    fun getPhotosObservable(): Observable<List<PhotoVO>>

    fun getPhotoDetail(id: Int, onSuccess: (PhotoVO) -> Unit, onFailure: (String) -> Unit)
}