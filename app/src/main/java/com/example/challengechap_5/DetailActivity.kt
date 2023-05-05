package com.example.challengechap_5

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.challengechap_5.databinding.ActivityDetailBinding
import com.example.challengechap_5.model.Tv

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataNote = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("data_tv", Tv::class.java)
        } else {
            intent.getParcelableExtra("data_tv")
        }

        val title = dataNote?.title
        val releaseDate = dataNote?.releaseDate
        val overview = dataNote?.overview
        val imagePath = dataNote?.imagePath

        binding.tvTitle.text = title
        binding.tvTglRelease.text = releaseDate
        binding.tvDesc.text = overview
        Glide.with(this).load("https://image.tmdb.org/t/p/w200/${imagePath}").fitCenter().into(binding.imageMovie)


    }
}