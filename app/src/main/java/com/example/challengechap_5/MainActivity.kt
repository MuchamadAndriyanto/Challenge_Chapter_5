package com.example.challengechap_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.challengechap_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModelTv:TvViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val apiKey = "5eadf04193e2a9bcea8a8e8f4cfa89e2"
//
//        RetrofitClient.instance.getTrendingMovie(apiKey).enqueue(object :
//            Callback<ResponseTvTrending> {
//            override fun onResponse(
//                call: Call<ResponseTvTrending>,
//                response: Response<ResponseTvTrending>
//            ) {
//                if (response.isSuccessful){
//                    binding.rvNews.apply {
//                        layoutManager = GridLayoutManager(baseContext, 2)
//                        adapter = NewsAdapter(response.body()?.results?: emptyList())
//                    }
//                    response.body()?.results?.map {
//                        Log.d("TAG", it.originalName)
//                    }
//                    Toast.makeText(this@MainActivity,"Data Berhasil dipanggil", Toast.LENGTH_SHORT).show()
//                } else {
//                    Log.d("TAG", "onFailure: ${response.errorBody()}")
//                }
//            }
//
//            override fun onFailure(call: Call<ResponseTvTrending>, t: Throwable) {
//                Log.d("TAG", "onFailure: $t ")
//            }
//
//        })
//
    }
}