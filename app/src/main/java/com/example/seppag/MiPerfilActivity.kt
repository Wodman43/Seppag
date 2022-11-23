package com.example.seppag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seppag.databinding.MiPerfilBinding

class MiperfilActivity : AppCompatActivity() {
    private lateinit var binding: MiPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
      var view=binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
    }
}