package com.example.nabiname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val itemsList = ArrayList<String>()
    //untuk mengumpulkan data jadi colection menjadi array
    private lateinit var customAdapter: NabiAdapter
    //class adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //memnggil activity lebih flxyb binding sebenarnya
        title = "Nabi List"
        //nama judul

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        customAdapter = NabiAdapter(itemsList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = customAdapter
        prepareItems()
        //custom recycleview untuk penyiapan list
    }
    private fun prepareItems() {
        itemsList.add("Nabi Adam")
        itemsList.add("Nabi Idris")
        itemsList.add("Nabi Nuh")
        itemsList.add("Nabi Hud")
        itemsList.add("Nabi Sholeh")
        itemsList.add("Nabi Ibrahim")
        itemsList.add("Nabi Luth")
        itemsList.add("Nabi Ismail")
        itemsList.add("Nabi Ishaq")
        itemsList.add("Nabi Yakub")
        itemsList.add("Nabi Yusuf")
        itemsList.add("Nabi Ayub")
        itemsList.add("Nabi Syuaib")
        customAdapter.notifyDataSetChanged()

        //kumpulan list yang di inginkan
    }
}