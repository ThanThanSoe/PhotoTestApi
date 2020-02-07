package com.padc.phototestapi.mvp.view

import com.padc.phototestapi.data.vos.PhotoVO

interface PhotoDetailView: BaseView{
    fun displayPhotoDetail(photoVO: PhotoVO)
}