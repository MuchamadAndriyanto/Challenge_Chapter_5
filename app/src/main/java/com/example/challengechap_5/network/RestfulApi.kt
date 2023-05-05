package com.example.challengechap_5.network

import com.example.challengechap_5.model.ResponseTrendingTv
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RestfulApi {
    @GET("trending/tv/week")
    fun getTrendingTv(
        @Query("api_key") api_key: String
    ): Call<ResponseTrendingTv>
}