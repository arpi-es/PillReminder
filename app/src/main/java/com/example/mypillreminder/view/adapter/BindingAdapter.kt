package com.example.mypillreminder.view.adapter

import android.os.Build
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mypillreminder.R
import com.example.mypillreminder.service.model.Pill

@BindingAdapter("LoadListItemImage")
fun bindLoadListItemImage(imageView: ImageView, imagePath: String?) {

    if (imagePath.isNullOrEmpty() ) return

    imagePath.let {
        val profilePictureUri = imagePath.toUri()

        Glide.with(imageView.context)
            .load(profilePictureUri)
            .placeholder(R.drawable.loading_animation)
            .error(R.drawable.ic_image_add)
//            .fallback(R.drawable.ic_image_add)
            .apply(RequestOptions.circleCropTransform())
            .into(imageView)
    }
}


@BindingAdapter("PillImage")
fun bindPillImage(imageView: ImageView, imagePath: String?) {

    imagePath?.let {
        val profilePictureUri = imagePath.toUri()

        Glide.with(imageView.context)
            .load(profilePictureUri)
            .placeholder(R.drawable.loading_animation)
            .error(R.drawable.ic_image_add)
            .fallback(R.drawable.ic_image_add)
            .apply(RequestOptions.circleCropTransform())
            .into(imageView)
    }
}



@BindingAdapter("pillList")
fun RecyclerView.submitPillList(pills: List<Pill>?) {
    val adapter = this.adapter as PillAdapter
    adapter.submitList(pills)
}

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@BindingAdapter("displayHasReminder")
fun ImageView.displayImage(hasReminder: Boolean?) {
    hasReminder?.let {
        if (it) {
            setImageDrawable( this.context.getDrawable(R.drawable.ic_notifications))
        } else {
            setImageDrawable(this.context.getDrawable(R.drawable.ic_notifications_off))
        }
    }
}
