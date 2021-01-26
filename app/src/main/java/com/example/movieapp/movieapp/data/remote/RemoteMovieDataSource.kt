package com.example.movieapp.movieapp.data.remote

import com.example.movieapp.movieapp.application.AppConstants
import com.example.movieapp.movieapp.data.model.MovieList
import com.example.movieapp.movieapp.repository.WebService

class RemoteMovieDataSource(private val webService: WebService) {
    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)
}