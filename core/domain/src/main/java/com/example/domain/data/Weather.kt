package com.example.domain.data

data class Weather(
    val cityName: String = "",

    val dateTime:Long = 0L,
    val monthDateText: String = "",
    val hourDateText:String = "",

    val weatherId:Int = 500,
    val weatherType: String = "",

    val description:String = "",
    val weatherIcon:String = "",

    val currentTemp: String = "",
    val maxTemp: String = "",
    val minTemp: String = "",
    val humidity: String = ""
)