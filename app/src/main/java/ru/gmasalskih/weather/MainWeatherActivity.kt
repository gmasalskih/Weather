package ru.gmasalskih.weather

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class MainWeatherActivity : ActivitySingleFragmentContainer() {
    override val fragmentInstance: Fragment
        get() = MainWeatherFragment()
    override val layoutId: Int
        get() = R.layout.activity_main_weather
    override val fragmentContainerId: Int
        get() = R.id.main_weather_fragment_container

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "Activity.onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Activity.onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle", "Activity.onRestart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "Activity.onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Activity.onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Activity.onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Activity.onDestroy()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Lifecycle", "Activity.onSaveInstanceState()")
    }
}