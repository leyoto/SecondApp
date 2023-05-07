package com.example.secondapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.secondapp.R
import com.example.secondapp.databinding.FirstSreenBinding

class FirstFragment : Fragment() {

    lateinit var binding: FirstSreenBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= FirstSreenBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tosecond.setOnClickListener {
            MAIN.navController.navigate(R.id.action_blankFragment_to_blankFragment2)
        }

    }

}

