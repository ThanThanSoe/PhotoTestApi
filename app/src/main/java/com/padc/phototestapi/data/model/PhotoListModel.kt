package com.padc.phototestapi.data.model

import android.hardware.camera2.CaptureFailure
import androidx.lifecycle.LiveData
import com.padc.phototestapi.data.vos.PhotoVO
import io.reactivex.internal.operators.single.SingleDoOnSuccess

interface PhotoListModel{
    fun getAllPhotos(
        onFailure: (String) -> Unit
    ) : LiveData<List<PhotoVO>>

    fun getPhotoDetail(
        id:Int,
        onSuccess: (PhotoVO) ->Unit,
        OnFailure: (String) ->Unit
    )

}