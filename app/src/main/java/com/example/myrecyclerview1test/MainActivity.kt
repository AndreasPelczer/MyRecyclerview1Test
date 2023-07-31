package com.example.myrecyclerview1test

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: RecyclerViewAdapter

    //content
    private lateinit var content:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initContent()
        initRecyclerview()
    }

    private fun initRecyclerview(){
        rv = findViewById(R.id.rv)
        layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        adapter = RecyclerViewAdapter(content)

        rv.layoutManager = layoutManager
        rv.adapter = adapter

    }

    private fun initContent(){

        content = ArrayList()
        content.add(User(content.size+1, "Andreas","Pelczer", "a.pelczer@outlook.de","0170 5006902"))
    }
}