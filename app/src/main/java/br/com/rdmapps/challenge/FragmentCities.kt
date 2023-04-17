package br.com.app-test.challenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation

class FragmentCities : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cities, container, false)

        val natal: LinearLayout = view.findViewById(R.id.city1)
        val rio: LinearLayout = view.findViewById(R.id.city2)
        val recife: LinearLayout = view.findViewById(R.id.city3)
        val saopaulo: LinearLayout = view.findViewById(R.id.city4)
        val joaopessoa: LinearLayout = view.findViewById(R.id.city5)
        val miami: LinearLayout = view.findViewById(R.id.city6)
        val newyork: LinearLayout = view.findViewById(R.id.city7)
        val newjersey: LinearLayout = view.findViewById(R.id.city8)
        val dallas: LinearLayout = view.findViewById(R.id.city9)
        val losangeles: LinearLayout = view.findViewById(R.id.city10)

        natal.setOnClickListener {
            (activity as MainActivity).city = "natal"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        rio.setOnClickListener {
            (activity as MainActivity).city = "rio"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        recife.setOnClickListener {
            (activity as MainActivity).city = "recife"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        saopaulo.setOnClickListener {
            (activity as MainActivity).city = "saopaulo"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        joaopessoa.setOnClickListener {
            (activity as MainActivity).city = "joaopessoa"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        miami.setOnClickListener {
            (activity as MainActivity).city = "miami"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        newyork.setOnClickListener {
            (activity as MainActivity).city = "newyork"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        newjersey.setOnClickListener {
            (activity as MainActivity).city = "newjersey"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        dallas.setOnClickListener {
            (activity as MainActivity).city = "dallas"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }
        losangeles.setOnClickListener {
            (activity as MainActivity).city = "losangeles"
            Navigation.findNavController(view).navigate(R.id.action_fragmentCities_to_fragmentCityDetail)
        }

        return view
    }
}