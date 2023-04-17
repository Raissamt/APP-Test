package br.com.app-test.challenge

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class FragmentCityDetail : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_city_detail, container, false)
        val city: String = (activity as MainActivity).city

        val img: ImageView = view.findViewById(R.id.imageCityDetail)
        val cityName: TextView = view.findViewById(R.id.cityName)
        val cityStateCountry: TextView = view.findViewById(R.id.cityStateCountry)
        val buttomSave: Button = view.findViewById(R.id.buttomSave)

        when(city) {
            "natal" -> {
                img.setImageResource(R.drawable.natal)
                cityName.text = "Natal"
                cityStateCountry.text = "Brasil"
            }
            "rio" -> {
                img.setImageResource(R.drawable.rio_de_janeiro)
                cityName.text = "Rio de Janeiro"
                cityStateCountry.text = "Brasil"
            }
            "recife" -> {
                img.setImageResource(R.drawable.recife)
                cityName.text = "Recife"
                cityStateCountry.text = "Brasil"
            }
            "saopaulo" -> {
                img.setImageResource(R.drawable.sao_paulo)
                cityName.text = "São Paulo"
                cityStateCountry.text = "Brasil"
            }
            "joaopessoa" -> {
                img.setImageResource(R.drawable.joao_pessoa)
                cityName.text = "João Pessoa"
                cityStateCountry.text = "Brasil"
            }
            "miami" -> {
                img.setImageResource(R.drawable.miami)
                cityName.text = "Miami"
                cityStateCountry.text = "Estados Unidos da América"
            }
            "newyork" -> {
                img.setImageResource(R.drawable.new_york)
                cityName.text = "Nova York"
                cityStateCountry.text = "Estados Unidos da América"
            }
            "newjersey" -> {
                img.setImageResource(R.drawable.new_jersey)
                cityName.text = "Nova Jersey"
                cityStateCountry.text = "Estados Unidos da América"
            }
            "dallas" -> {
                img.setImageResource(R.drawable.dallas)
                cityName.text = "Dallas"
                cityStateCountry.text = "Estados Unidos da América"
            }
            "losangeles" -> {
                img.setImageResource(R.drawable.los_angeles)
                cityName.text = "Los Angeles"
                cityStateCountry.text = "Estados Unidos da América"
            }
        }

        buttomSave.setOnClickListener {
            Toast.makeText(activity,"Disponível em implementações futuras", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}