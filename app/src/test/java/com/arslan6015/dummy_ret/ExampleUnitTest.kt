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
import org.junit.Assert
import org.junit.Test
import retrofit2.http.GET

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, (2 + 2).toLong())
    }
}