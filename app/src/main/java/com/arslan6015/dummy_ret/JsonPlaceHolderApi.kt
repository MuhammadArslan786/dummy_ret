package com.arslan6015.dummy_ret

import com.google.gson.annotations.SerializedName
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import com.arslan6015.dummy_ret.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.arslan6015.dummy_ret.JsonPlaceHolderApi
import com.arslan6015.dummy_ret.Post
import retrofit2.Call
import retrofit2.http.GET

interface JsonPlaceHolderApi {
    @GET("posts")
    open fun getPosts(): Call<MutableList<Post?>?>?
}