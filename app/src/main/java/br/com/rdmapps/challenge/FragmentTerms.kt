package br.com.app-test.challenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.navigation.Navigation

class FragmentTerms : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_terms, container, false)

        val checkBox: CheckBox = view.findViewById(R.id.checkBox)
        val buttonNext: Button = view.findViewById(R.id.buttonNext)

        buttonNext.setOnClickListener {
            if(checkBox.isChecked){
                Navigation.findNavController(view).navigate(R.id.action_fragmentTerms_to_fragmentCities)

            }else{
                Toast.makeText(activity,"É necessário aceitar os termos de uso para continuar!", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}