package ru.gmasalskih.weather

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.gmasalskih.weather.databinding.FragmentMainWeatherBinding
import ru.gmasalskih.weather.viewModel.WeatherScreen

class MainWeatherFragment : Fragment() {

    lateinit var binding:FragmentMainWeatherBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Lifecycle", "Fragment.onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "Fragment.onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainWeatherBinding.inflate(inflater,container, false).apply {
            weatherScreen = WeatherScreen()
        }
        Log.d("Lifecycle", "Fragment.onCreateView()")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.TextViewCity.setOnClickListener {
            binding.weatherScreen?.city = "Ekaterinburg"
            binding.invalidateAll()
        }
        if(savedInstanceState != null){
            binding.weatherScreen?.city = savedInstanceState.getString("city", "Moscow")
            binding.invalidateAll()
        }
        Log.d("Lifecycle", "Fragment.onViewCreated()")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Lifecycle", "Fragment.onActivityCreated()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Fragment.onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "Fragment.onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Fragment.onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Fragment.onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Lifecycle", "Fragment.onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Fragment.onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Lifecycle", "Fragment.onDetach()")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("city", binding.weatherScreen?.city)
        Log.d("Lifecycle", "Fragment.onSaveInstanceState()")
    }
}

