package br.com.rdmapps.challenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation

class FragmentRegistration : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registration, container, false)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentCadastro_to_fragmentTerms)
        }

        view.findViewById<Button>(R.id.nameText)

        val userName: TextView = view.findViewById(R.id.nameText)
        val userAge: TextView = view.findViewById(R.id.ageText)
        val userEmail: TextView = view.findViewById(R.id.emailText)
        val userAddress: TextView = view.findViewById(R.id.addressText)
        val userPassword: TextView = view.findViewById(R.id.passwordText)
        val buttonNext: Button = view.findViewById(R.id.button)

        buttonNext.setOnClickListener {

            if(isEmpty(userName) || isEmpty(userAge) || isEmpty(userEmail) || isEmpty(userAddress) || isEmpty(userPassword)){
                Toast.makeText(activity,"É necessário preencher todos os campos!", Toast.LENGTH_SHORT).show()
            }else if(userPassword.getText().toString().length < 6){
                Toast.makeText(activity,"A senha deve possuir mais de 5 caracteres!", Toast.LENGTH_SHORT).show()
            }
            else{
                Navigation.findNavController(view).navigate(R.id.action_fragmentCadastro_to_fragmentTerms)
            }
        }

        return view
    }

    fun isEmpty(textView: TextView):Boolean{
        if(textView.getText().toString().equals("")){
            textView.error = "Vazio"
            return true
        }
        textView.error = null
        return false
    }
}