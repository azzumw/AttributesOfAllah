package com.example.andriod.attributesofallah

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.andriod.attributesofallah.databinding.FragmentNameDetailBinding
import com.example.andriod.attributesofallah.model.Attribute

class NameDetailFragment : Fragment() {

    private var _binding: FragmentNameDetailBinding? = null
    private val binding get() = _binding!!

    private lateinit var name: Attribute

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments.let {
            name = it?.getParcelable("attribute") ?: Attribute(
                R.string.eng_ar_raheem,
                R.string.trans_ar_raheem,
                R.string.ar_raheem
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNameDetailBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val transliteration = context?.resources?.getString(name.transliteration)
        binding.attrName.text = transliteration
    }
}