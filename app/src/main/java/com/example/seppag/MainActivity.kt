package com.example.seppag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.seppag.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
<<<<<<< HEAD

=======
    private lateinit var binding: ActivityMainBinding
>>>>>>> origin/main
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        var view=binding.root
        super.onCreate(savedInstanceState)

        setContentView(view)


        binding.btnIniciarSesion.setOnClickListener {
            var intent = Intent(this, activity_requerimientos::class.java)
            startActivity(intent)
        }
    }
}