package com.padc.phototestapi.activity

import android.content.Context
import android.content.Intent
import com.padc.phototestapi.data.vos.PhotoVO
import com.padc.phototestapi.mvp.view.PhotoDetailView
import com.padc.phototestapi.mvp.view.PhotoListView

class PhotoDetailAcitivity: BaseActivity(), PhotoDetailView, PhotoListView{
    override fun displayError(errorMessage: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object{
        const val EXTRA_PHOTO_ID = "photo_id"
        fun newIntent(context: Context, photo_id:Int): Intent{
            return Intent(context, PhotoDetailAcitivity::class.java).apply {
                putExtra(EXTRA_PHOTO_ID, photo_id)
            }
        }
    }
    override fun displayPhotoDetail(photoVO: PhotoVO) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun displayPhotoList(photoList: List<PhotoVO>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToDetail(photoId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}