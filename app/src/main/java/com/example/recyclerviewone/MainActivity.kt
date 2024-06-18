package com.example.recyclerviewone

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRview : RecyclerView
    private lateinit var applist: ArrayList<Dataclassone>
    lateinit var ImageId : Array<Int>
    lateinit var TitleId : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImageId = arrayOf(
            R.drawable.ic_image,
            R.drawable.ic_date,
            R.drawable.ic_edit,
            R.drawable.ic_list,
            R.drawable.ic_text,
            R.drawable.ic_camera,
            R.drawable.ic_checkbox,
            R.drawable.ic_rating,
            R.drawable.ic_time,
            R.drawable.ic_toggle
        )
        TitleId = arrayOf(
            "Image Picker",
            "Date Picker",
            "Edit Picker",
            "List Picker",
            "Text Picker",
            "Camera Picker",
            "CheckBox Picker",
            "Rating Bar Picker",
            "Time Picker",
            "Toggle Bar Picker"
        )
        newRview = findViewById(R.id.recyclerview)
        newRview.layoutManager = LinearLayoutManager(this)
        newRview.setHasFixedSize(true)
        applist = arrayListOf<Dataclassone>()
        getUserData()


        }

    private fun getUserData() {
        for(i in ImageId.indices)
        {
        val data = Dataclassone(ImageId[i], TitleId[i])
        applist.add(data)
            newRview.adapter = MyAdapter(applist)
    }
}
}