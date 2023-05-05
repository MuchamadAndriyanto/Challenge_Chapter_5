package com.example.challengechap_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.challengechap_5.databinding.ActivityMainBinding
import com.example.challengechap_5.model.ResponseTrendingTv
import com.example.challengechap_5.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiKey = "5eadf04193e2a9bcea8a8e8f4cfa89e2"

        RetrofitClient.instance.getTrendingTv(apiKey).enqueue(object :
            Callback<ResponseTrendingTv> {
            override fun onResponse(
                call: Call<ResponseTrendingTv>,
                response: Response<ResponseTrendingTv>
            ) {
                if (response.isSuccessful){
                    binding.rvNews.apply {
                        layoutManager = GridLayoutManager(baseContext, 2)
                        adapter = TvAdapter(response.body()?.results?: emptyList())
                    }
                    response.body()?.results?.map {
                        Log.d("TAG", it.originalName)
                    }
                    Toast.makeText(this@MainActivity,"Data Berhasil dipanggil", Toast.LENGTH_SHORT).show()
                } else {
                    Log.d("TAG", "onFailure: ${response.errorBody()}")
                }
            }

            override fun onFailure(call: Call<ResponseTrendingTv>, t: Throwable) {
                Log.d("TAG", "onFailure: $t ")
            }

        })

    }
}