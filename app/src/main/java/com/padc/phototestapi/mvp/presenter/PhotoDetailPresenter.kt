package com.padc.phototestapi.mvp.presenter

import com.padc.phototestapi.activity.BaseActivity
import com.padc.phototestapi.data.model.PhotoListModelImpl
import com.padc.phototestapi.mvp.view.PhotoDetailView

class PhotoDetailPresenter: BasePresenter<PhotoDetailView>(){
    fun onUiReady(activity: BaseActivity, photoId: Int){
        if(photoId != null){
            val model = PhotoListModelImpl
            model.getPhotoDetail(photoId,{
                mView.displayPhotoDetail(it)
            },{

            })
        }
    }
}