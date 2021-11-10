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
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {
    private var textViewResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewResult = findViewById(R.id.text_view_result)  as TextView
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val jsonPlaceHolderApi = retrofit.create(
            JsonPlaceHolderApi::class.java
        )
        val call = jsonPlaceHolderApi.getPosts();
        if (call != null) {
            call.enqueue(object : Callback<MutableList<Post?>?> {
                override fun onResponse(
                    call: Call<MutableList<Post?>?>?,
                    response: Response<MutableList<Post?>?>?
                ) {
                    if (response != null) {
                        if (!response.isSuccessful()) {
//                            textViewResult.setText("Code: " + response.code())
                            textViewResult!!.text = "Code: " + response.code()

                            return
                        }
                    }
                    val posts = response?.body()
                    if (posts != null) {
                        for (post in posts) {
                            var content = ""
                            content += """
                                            ID: ${post?.getId()}
                                            
                                            """.trimIndent()
                            content += """
                                            User ID: ${post?.getUserId()}
                                            
                                            """.trimIndent()
                            content += """
                                            Title: ${post?.getTitle()}
                                            
                                            """.trimIndent()
                            content += """
                                            Text: ${post?.getText()}
                                        
                                            """.trimIndent()
                            textViewResult!!.append(content)
                        }
                    }
                }

                override fun onFailure(call: Call<MutableList<Post?>?>?, t: Throwable?) {
//                    textViewResult.setText(t.message)
                    if (t != null) {
                        textViewResult!!.text = t.message
                    }

                }
            })
        }
    }
}