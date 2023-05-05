package com.example.challengechap_5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.challengechap_5.databinding.ItemTvBinding
import com.example.challengechap_5.model.Result

class TvAdapter(var listTv: List<Result>): RecyclerView.Adapter<TvAdapter.ViewHolder>() {

    class ViewHolder (var binding : ItemTvBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTv.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val list = listTv[position]
        holder.binding.tvTitle.text = list.name
        holder.binding.tvDate.text = list.firstAirDate
        Glide.with(holder.itemView).load("https://image.tmdb.org/t/p/w200/${list.posterPath}").fitCenter().into(holder.binding.imgView)

//        holder.binding.cvDetailMoview.setOnClickListener {
//
//            val title = list.name
//            val date = list.firstAirDate
//            val overview = list.overview
//            val image = list.posterPath
//
//            val movieData = Movie(title,date,overview,image)
//            val Intent = Intent(holder.itemView.context, DetailActivity::class.java)
//            Intent.putExtra("data_movie",movieData)
//            holder.itemView.context.startActivity(Intent)
//        }
    }
}
