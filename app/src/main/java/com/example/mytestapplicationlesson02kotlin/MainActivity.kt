package com.example.mytestapplicationlesson02kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.mytestapplicationlesson02kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)  //Binding
        setContentView(binding.root)

        binding.inputEditText.addTextChangedListener {
            Model.importantString = it.toString()
        }

        binding.subscribeButton.setOnClickListener {
            Model.importantLiveData.observe(this) {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }

        binding.unsubscribeButton.setOnClickListener {
            Model.importantLiveData.removeObservers(this)
        }
    }
}