package com.example.movieapp.movieapp.movieapp.movie.ui.movie.adapters.concat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.PopularMoviesRowBinding
import com.example.movieapp.databinding.UpcomingMovieRowBinding
import com.example.movieapp.movieapp.core.BaseConcatHolder
import com.example.movieapp.movieapp.movieapp.movie.ui.movie.adapters.MovieAdapter

class UpComingConcatAdapter (private val movieAdapater: MovieAdapter):
    RecyclerView.Adapter<BaseConcatHolder<*>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseConcatHolder<*> {
        val itemBinding = UpcomingMovieRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConcatViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: BaseConcatHolder<*>, position: Int) {
        when(holder){
            is ConcatViewHolder ->holder.bind(movieAdapater)
        }
    }

    override fun getItemCount(): Int = 1

    private inner class ConcatViewHolder(val binding: UpcomingMovieRowBinding):
        BaseConcatHolder<MovieAdapter>(binding.root){
        override fun bind(adapter: MovieAdapter) {
            binding.rvUpcomingMovies.adapter = adapter
        }
    }
}