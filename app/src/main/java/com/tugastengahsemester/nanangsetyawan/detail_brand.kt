package com.tugastengahsemester.nanangsetyawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent.EXTRA_ORIGIN
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class detail_brand : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_brand)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Brand"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetIden: TextView = findViewById(R.id.tv_set_identity)
        val tvOverview: TextView = findViewById(R.id.tv_set_overview)
        val tvOrigin: TextView = findViewById(R.id.tv_item_origin)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tIden = intent.getStringExtra(EXTRA_IDENTITY)
        val tOverview = intent.getStringExtra(EXTRA_OVERVIEW)
        val tOrigin = intent.getStringExtra(EXTRA_ORIGIN)



        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetIden.text = tIden
        tvOverview.text = tOverview
        tvOrigin.text = tOrigin
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_IDENTITY = "extra_identity"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_ORIGIN = "extra_origin"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}