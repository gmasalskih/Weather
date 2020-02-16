package ru.gmasalskih.weather.viewModel

import java.text.SimpleDateFormat
import java.util.*

data class WeatherScreen(
    var currentData: String = SimpleDateFormat(
        "dd.MM.yyyy HH:mm",
        Locale.getDefault()
    ).format(Date()),
    var iconOfWeather: Int = 0,
    var city: String = "Moscow",
    var humidity: String = "80%",
    var wind: String = "10 m/s",
    var degrees: String = "11 ℃"
)