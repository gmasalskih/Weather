package ru.gmasalskih.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CitySelectionActivity : AppCompatActivity() {

    private val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_selection)
        if (fm.findFragmentById(R.id.city_selection_fragment_container) == null) {
            fm.beginTransaction()
                .add(R.id.city_selection_fragment_container, MainWeatherFragment())
                .commit()
        }
    }
}
