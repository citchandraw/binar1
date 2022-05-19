package com.example.binar1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SpinnerRecyclerActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_recycler)

        val spinner = findViewById<Spinner>(R.id.spinner)

        //item pertama untuk menampilkan spinner, berisi data yang ingin dipilih user
        val dataSet = arrayOf("SD", "SMP", "Kuliah")

        //item kedua, adapter berfungsi untuk menghubungkan dataset ke tampilan UI
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(
            context = this@SpinnerRecyclerActivity,
            android.R.layout.simple_spinner_dropdown_item, dataSet
        )

        // set adapter ke spinner
        spinner.adapter = adapter
    }
}