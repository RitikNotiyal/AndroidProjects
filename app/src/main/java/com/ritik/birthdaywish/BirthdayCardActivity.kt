package com.ritik.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_card.*

class BirthdayCardActivity : AppCompatActivity() {
    companion object{
        const val Name_Extra = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_card)

        val name = intent.getStringExtra(Name_Extra)
        birthdayGreet.setText("Happy Birthday\n$name!")
    }
}