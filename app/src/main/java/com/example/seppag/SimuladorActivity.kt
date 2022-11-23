package com.example.seppag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seppag.databinding.ActivityMainBinding
import com.example.seppag.databinding.ActivityPerfilBinding
import com.example.seppag.databinding.ActivitySimuladorBinding

class SimuladorActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySimuladorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivitySimuladorBinding.inflate(layoutInflater)
        var view=binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
    }
}