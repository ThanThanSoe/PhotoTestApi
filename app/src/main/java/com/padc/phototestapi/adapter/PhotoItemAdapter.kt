package com.padc.phototestapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padc.phototestapi.R
import com.padc.phototestapi.data.vos.PhotoVO
import com.padc.phototestapi.delegate.ItemClicked
import com.padc.phototestapi.viewHolders.PhotoItemViewHolder

class PhotoItemAdapter(private val delegate: ItemClicked):BaseAdapter<PhotoItemViewHolder,PhotoVO>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.content_main,parent, false)
        return PhotoItemViewHolder(layout, delegate)
    }

}