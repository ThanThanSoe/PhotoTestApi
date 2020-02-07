package com.padc.phototestapi.mvp.view

import com.padc.phototestapi.data.vos.PhotoVO

interface PhotoListView: BaseView{
    fun displayPhotoList(photoList: List<PhotoVO>)
    fun navigateToDetail(photoId: Int)
    fun displayError(errorMessage: String)
}