package ru.gmasalskih.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main_weather.view.*

class MainWeatherFragment : Fragment() {

    lateinit var currentData: TextView
    lateinit var iconOfWeather: ImageView
    lateinit var degrees: TextView
    lateinit var wind: TextView
    lateinit var humidity: TextView
    lateinit var city: TextView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_weather, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            currentData = TextView_currentData
            iconOfWeather = ImageView_iconOfWeather
            degrees = TextView_degrees
            wind = TextView_wind
            humidity = TextView_humidity
            city = TextView_city
        }
    }
}
