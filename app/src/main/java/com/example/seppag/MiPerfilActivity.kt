package com.example.seppag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seppag.databinding.ActivityMiPerfilBinding

class MiPerfilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMiPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMiPerfilBinding.inflate(layoutInflater)
        var view=binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
    }
}