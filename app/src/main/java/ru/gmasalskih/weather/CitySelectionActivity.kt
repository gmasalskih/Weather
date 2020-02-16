package ru.gmasalskih.weather

import androidx.fragment.app.Fragment

class CitySelectionActivity : ActivitySingleFragmentContainer() {
    override val fragmentInstance: Fragment
        get() = CitySelectionFragment()
    override val layoutId: Int
        get() = R.layout.activity_city_selection
    override val fragmentContainerId: Int
        get() = R.id.city_selection_fragment_container
}
