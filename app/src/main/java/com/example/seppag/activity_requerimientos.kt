package com.example.seppag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seppag.databinding.ActivityMainBinding
import com.example.seppag.databinding.ActivityRequerimientosBinding

class activity_requerimientos : AppCompatActivity() {
    private lateinit var binding: ActivityRequerimientosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityRequerimientosBinding.inflate(layoutInflater)
        var view=binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
    }
}