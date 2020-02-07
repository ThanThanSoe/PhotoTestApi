package com.padc.phototestapi.mvp.presenter

import androidx.lifecycle.Observer
import com.padc.phototestapi.activity.BaseActivity
import com.padc.phototestapi.data.model.PhotoListModelImpl
import com.padc.phototestapi.delegate.ItemClicked
import com.padc.phototestapi.mvp.view.PhotoListView

class PhotoListPresenter: BasePresenter<PhotoListView>(), ItemClicked{

    override fun onItemClicked(id: Int) {
        mView.navigateToDetail(id)
    }

    fun onUiReady(activity: BaseActivity){
        val model = PhotoListModelImpl
        model.getAllPhotos { mView.displayError(it) }
            .observe(activity, Observer {
                mView.displayPhotoList(it)
            })
    }

}