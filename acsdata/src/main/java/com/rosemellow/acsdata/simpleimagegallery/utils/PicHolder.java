package com.rosemellow.acsdata.simpleimagegallery.utils;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rosemellow.acsdata.R;


public class PicHolder extends RecyclerView.ViewHolder{

    public ImageView picture;

    PicHolder(@NonNull View itemView) {
        super(itemView);

        picture = itemView.findViewById(R.id.image);
    }
}
