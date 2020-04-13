package com.practice.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.practice.test.adapter.Adapter
import com.practice.test.source.data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val gameList = ArrayList<data>()
    var Adapter:Adapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameList.add(data("아스팔트 8", "GameLoft", 5))
        gameList.add(data("MineCraft", "Mojang", 4))
        gameList.add(data("아스팔트 7", "GameLoft", 4))
        gameList.add(data("팔라독", "FazeCat", 2))
        gameList.add(data("Plants vs. Zombies", "EA Games", 3))
        gameList.add(data("스왐피", "Disney", 5))
        gameList.add(data("리니지2M", "NC Soft", 3))
        gameList.add(data("리니지M", "NC Soft", 4))
        gameList.add(data("AFK 아레나", "Lilith Games", 1))



        Adapter = Adapter(this, R.layout.app, gameList)
        gameListView.adapter = Adapter


        gameListView.setOnItemClickListener { parent, view, position, id -> }
        Toast.makeText(this, "{position}번 줄 클릭", Toast.LENGTH_SHORT).show()


    }
}
