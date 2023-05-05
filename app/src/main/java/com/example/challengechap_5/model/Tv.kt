package com.example.challengechap_5.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Tv(
    val title:String,
    val overview:String,
    val releaseDate:String,
    val imagePath:String
): Parcelable