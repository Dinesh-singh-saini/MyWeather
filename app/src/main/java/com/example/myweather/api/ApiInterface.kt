package com.example.myweather.api

import com.example.myweather.weather_data.WeatherData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("forecast.json")
    fun getWeatherWithLocation(
        @Query("key") key: String,
        @Query("q") location: String,
        @Query("days") days: Int = 8,
        @Query("aqi") aqi: String = "yes",
        @Query("alerts") alerts: String = "yes"
    ): Call<WeatherData>

}
