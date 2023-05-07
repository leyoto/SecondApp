package com.example.secondapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.secondapp.databinding.ActivityMainBinding
import com.example.secondapp.ui.main.MAIN

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController


    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController=Navigation.findNavController(this,R.id.nav_host_fragment)
        MAIN = this
    }

}
