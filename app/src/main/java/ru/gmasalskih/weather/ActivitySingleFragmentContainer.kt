package ru.gmasalskih.weather

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

abstract class ActivitySingleFragmentContainer : AppCompatActivity() {
    private val fm = supportFragmentManager

    protected abstract val fragmentInstance: Fragment

    protected abstract val layoutId: Int

    protected abstract val fragmentContainerId: Int

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        if (fm.findFragmentById(fragmentContainerId) == null) {
            fm.beginTransaction()
                .add(fragmentContainerId, fragmentInstance)
                .commit()
        }
    }

}