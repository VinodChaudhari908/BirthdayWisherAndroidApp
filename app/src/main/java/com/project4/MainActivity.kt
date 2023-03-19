package com.project4

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.project4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun createBirthdayCard(view: View) {

        val name = binding.nameInput.editableText.toString()
        val intent=Intent(this, GreetingActivity::class.java)
        intent.putExtra(GreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}