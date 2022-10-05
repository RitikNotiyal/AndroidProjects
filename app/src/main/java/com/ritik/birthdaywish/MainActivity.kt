package com.ritik.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: android.view.View) {

        val name = nameInput.editableText.toString()

        val intent = Intent(this, BirthdayCardActivity::class.java)
        intent.putExtra(BirthdayCardActivity.Name_Extra, name)

        startActivity(intent)
    }

}