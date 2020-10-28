package com.tugastengahsemester.nanangsetyawan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBrand: RecyclerView
    private var list: ArrayList<Brand> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"

        rvBrand = findViewById(R.id.rv_brand)
        rvBrand.setHasFixedSize(true)

        list.addAll(BrandData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvBrand.layoutManager = LinearLayoutManager(this)
        val listBrand = ListBrand(list)
        rvBrand.adapter = listBrand
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@MainActivity, about::class.java)
                startActivity(iAbout)
            }
        }
    }
}
