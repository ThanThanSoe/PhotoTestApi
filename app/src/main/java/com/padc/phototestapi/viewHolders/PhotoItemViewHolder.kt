package com.padc.phototestapi.viewHolders

import android.view.View
import com.padc.phototestapi.data.vos.PhotoVO
import com.padc.phototestapi.delegate.ItemClicked
import kotlinx.android.synthetic.main.content_main.view.*

class PhotoItemViewHolder(itemView: View, private val delegate: ItemClicked): BaseViewHolder<PhotoVO>(itemView){

    init {
        itemView.imgPhoto.setOnClickListener{
            data?.id?.let { id ->
                delegate.onItemClicked(id)
            }
        }
    }

    override fun bindData(data: PhotoVO) {
        itemView.txtImageName.text = data.fileName
    }


}