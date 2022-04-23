package com.example.fragmentkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*
import com.example.fragmentkotlin.MainActivity as MainActivity1


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_one.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_one : Fragment() {


    private lateinit var myTextView: TextView



    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?





    ): View? {
        // Inflate the layout for this fragment
        val conector =inflater.inflate (R.layout.fragment_one, container, false)




        val numero1=conector.findViewById<TextView>(R.id.edtNum1)
        val numero2=conector.findViewById<TextView>(R.id.edtNum2)
        val res=conector.findViewById<TextView>(R.id.txtResultado)
        val elboton=conector.findViewById<Button>(R.id.btnSumar)




conector.btnSumar.setOnClickListener {


    val num1=numero1.text.toString().toInt()
    val num2=numero2.text.toString().toInt()
    val suma = num1 + num2
    res.text=suma.toString()
    val textoarriba=conector.findViewById<TextView>(R.id.textView2)
    textoarriba.text="enviamos una cadena"


//comunicamos el fragment con la actividad contenedora
    val vista = activity?.findViewById<TextView>(R.id.texto)
    if (vista != null) {
        vista.text="se realizó la suma!"
    }

}
        return  conector



    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment_one.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_one().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}