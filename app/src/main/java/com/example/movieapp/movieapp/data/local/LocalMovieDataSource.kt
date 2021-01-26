package com.example.movieapp.movieapp.data.local

import com.example.movieapp.databinding.MovieItemBinding
import com.example.movieapp.movieapp.application.AppConstants
import com.example.movieapp.movieapp.data.model.MovieEntity
import com.example.movieapp.movieapp.data.model.MovieList
import com.example.movieapp.movieapp.data.model.toMovieList

class LocalMovieDataSource(private val movieDAO: MovieDAO) {

    suspend fun getUpcomingMovies(): MovieList {
        return movieDAO.getAllMovies().filter { it.movie_type == "upcoming" }.toMovieList()
    }

    suspend fun getTopRatedMovies(): MovieList  {
        return movieDAO.getAllMovies().filter { it.movie_type == "toprated" }.toMovieList()
    }

    suspend fun getPopularMovies(): MovieList{
        return movieDAO.getAllMovies().filter{ it.movie_type == "popular" }.toMovieList()
    }
    suspend fun saveMovie(movie: MovieEntity){
        movieDAO.saveMovie(movie)
    }
}