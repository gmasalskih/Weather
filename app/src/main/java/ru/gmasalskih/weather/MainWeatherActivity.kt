package ru.gmasalskih.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainWeatherActivity : AppCompatActivity() {

    private val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_weather)
        if (fm.findFragmentById(R.id.main_weather_fragment_container) == null) {
            fm.beginTransaction()
                .add(R.id.main_weather_fragment_container, MainWeatherFragment())
                .commit()
        }
    }
}