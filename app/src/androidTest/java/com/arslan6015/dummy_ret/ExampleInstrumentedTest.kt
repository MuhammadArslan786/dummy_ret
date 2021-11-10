package com.arslan6015.dummy_ret

import com.google.gson.annotations.SerializedName
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.arslan6015.dummy_ret.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.arslan6015.dummy_ret.JsonPlaceHolderApi
import com.arslan6015.dummy_ret.Post
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import retrofit2.http.GET

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.arslan6015.dummy_ret", appContext.packageName)
    }
}