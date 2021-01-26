package com.example.movieapp.movieapp.repository

import com.example.movieapp.movieapp.data.model.MovieList

interface MovieRepository {
    suspend fun getUpcomingMovies():MovieList
    suspend fun getTopRatedMovies():MovieList
    suspend fun getPopularMovies():MovieList
}