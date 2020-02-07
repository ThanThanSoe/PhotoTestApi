package com.padc.phototestapi.mvp.presenter

import androidx.lifecycle.ViewModel
import com.padc.phototestapi.mvp.view.BaseView

abstract class BasePresenter<T: BaseView>:ViewModel(){
    protected lateinit var mView: T

    open fun initPresenter(view: T){
        this.mView = view
    }
}