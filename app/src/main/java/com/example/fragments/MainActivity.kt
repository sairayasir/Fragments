package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.Fragments.BlankFragment1
import com.example.fragments.Fragments.BlankFragment2
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var manager = supportFragmentManager //support of fragment
        var tr = manager.beginTransaction() //start tr
        tr.replace(R.id.fragment, BlankFragment1())
        tr.addToBackStack(null)
        tr.commit() //make it permanent

        binding.button1.setOnClickListener {

            var manager = supportFragmentManager //support of fragment
            var tr = manager.beginTransaction() //start tr
            tr.replace(R.id.fragment, BlankFragment1())
            tr.addToBackStack(null)
            tr.commit() //make it permanent
        }

        binding.button2.setOnClickListener {

            var manager = supportFragmentManager //support of fragment
            var tr = manager.beginTransaction() //start tr
            tr.replace(R.id.fragment, BlankFragment2())
            tr.addToBackStack(null)
            tr.commit() //make it permanent
        }
    }
}