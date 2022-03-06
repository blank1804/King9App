package com.fnal_etech.n9_final_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubLyric : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_lyric)

        val bundle = intent.extras
        val text = intent.extras!!.getString("song")
        val lyric = intent.extras!!.getString("full_lyric")
        val textForView = findViewById<TextView>(R.id.textForView)
        val lyricForView = findViewById<TextView>(R.id.LyricForView)

        textForView.text = text
        lyricForView.text = lyric
    }
}