package com.example.andriod.attributesofallah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.andriod.attributesofallah.adapter.ItemAdapter
import com.example.andriod.attributesofallah.data.DataSource
import com.example.andriod.attributesofallah.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//
//        recyclerView.adapter = ItemAdapter(this)
//        recyclerView.setHasFixedSize(true)


    }
}