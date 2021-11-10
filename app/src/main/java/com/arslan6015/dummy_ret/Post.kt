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
import retrofit2.http.GET

class Post {
    private val userId = 0
    private val id = 0
    private val title: String? = null

    @SerializedName("body")
    private val text: String? = null
    fun getUserId(): Int {
        return userId
    }

    fun getId(): Int {
        return id
    }

    fun getTitle(): String? {
        return title
    }

    fun getText(): String? {
        return text
    }
}