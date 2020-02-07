package com.padc.phototestapi.activity

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.padc.phototestapi.R
import com.padc.phototestapi.adapter.PhotoItemAdapter
import com.padc.phototestapi.data.vos.PhotoVO
import com.padc.phototestapi.mvp.presenter.PhotoListPresenter
import com.padc.phototestapi.mvp.view.PhotoListView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :BaseActivity(), PhotoListView {
    override fun displayError(errorMessage: String) {
        Snackbar.make(rootView, errorMessage, Snackbar.LENGTH_LONG).show()
    }


    override fun navigateToDetail(photoId: Int) {
        startActivity(PhotoDetailAcitivity.newIntent(applicationContext, photoId))
    }

    private lateinit var  photoItemAdapter: PhotoItemAdapter

    private lateinit var photoListPresenter: PhotoListPresenter

    override fun displayPhotoList(photoList: List<PhotoVO>) {
        photoItemAdapter.setNewData(photoList.toMutableList())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        photoListPresenter = ViewModelProviders.of(this)
            .get(PhotoListPresenter::class.java)

        photoItemAdapter = PhotoItemAdapter(photoListPresenter)

        with(rvPhotos){
          layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            setHasFixedSize(true)
            adapter = photoItemAdapter
        }

        photoListPresenter.onUiReady(this)
    }

}
