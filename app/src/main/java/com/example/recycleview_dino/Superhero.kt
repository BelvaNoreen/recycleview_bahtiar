package com.example.recycleview_dino

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Superhero(
    val imgsuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable
