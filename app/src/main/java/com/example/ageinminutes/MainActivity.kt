package com.example.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.ageinminutes.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btnDatePicker)

        button.setOnClickListener {view ->

            clickDatePicker(view)

        }

    }

    fun clickDatePicker(view: View) {

        val myCalender = Calendar.getInstance()

        val year = myCalender.get(Calendar.YEAR)

        val month = myCalender.get(Calendar.MONTH)

        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

            Toast.makeText(this, "works", Toast.LENGTH_LONG).show()

        }, year, month, day).show()

    }
}