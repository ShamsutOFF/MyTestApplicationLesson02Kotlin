package com.example.mytestapplicationlesson02kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.mytestapplicationlesson02kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var subscribeButton: Button
    private lateinit var unsubscribeButton: Button
    private lateinit var inputEditText: EditText

    private lateinit var binding: ActivityMainBinding

    private val model = Model()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)  //Binding
        setContentView(binding.root)

        subscribeButton = findViewById(R.id.subscribe_button)
        unsubscribeButton = findViewById(R.id.unsubscribe_button)
        inputEditText = findViewById(R.id.input_edit_text)

        inputEditText.addTextChangedListener{
            model.setValue(it.toString())
        }

        subscribeButton.setOnClickListener {
            model.subscriber = {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }
        unsubscribeButton.setOnClickListener {
            model.subscriber = null
        }
    }
}