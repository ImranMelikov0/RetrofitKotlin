package com.imranmelikov.retrofitkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val select=Select()
        select.personSelect()

        val search=Search()
        search.personSearch("Test")

        val delete=Delete()
        delete.personDelete(15473)

        val insert=Insert()
        insert.insertPerson("Android","Kotlin")

        val update=Update()
        update.updatePerson(15503,"Bandroid","Fotlin")
    }
}