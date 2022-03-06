package com.fnal_etech.n9_final_app


import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class SubSong : AppCompatActivity() {
    //เครื่องเล่นเพลง
    private lateinit var mp: MediaPlayer
    private var totalTime: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_song)



        mp = MediaPlayer.create(this, R.raw.m1)
        mp.isLooping = true
        mp.setVolume(1.0f, 1.0f)
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC)
        totalTime = mp.duration


        val bundle = intent.extras
        val text = intent.extras!!.getString("song")
        val textForView = findViewById<TextView>(R.id.textForView)

        textForView.text = text
        if(textForView.text.toString() == "แสงเทียน"){
            mp = MediaPlayer.create(this, R.raw.saengtien)}
        if(textForView.text.toString() == "ยามเย็น"){
            mp = MediaPlayer.create(this, R.raw.yarmyen)}
        if(textForView.text.toString() == "สายฝน"){
            mp = MediaPlayer.create(this, R.raw.saifon)}
        if(textForView.text.toString() == "ใกล้รุ่ง"){
            mp = MediaPlayer.create(this, R.raw.klairoong)}
        if(textForView.text.toString() == "ชะตาชีวิต"){
            mp = MediaPlayer.create(this, R.raw.chatacheewit)}
        if(textForView.text.toString() == "ค่ำแล้ว"){
            mp = MediaPlayer.create(this, R.raw.yb_kumlaew)}
        if(textForView.text.toString() == "สายลม"){
            mp = MediaPlayer.create(this, R.raw.yb_sailom)}
        if(textForView.text.toString() == "ไกลกังวล"){
            mp = MediaPlayer.create(this, R.raw.yb_kaikungvon)}
        if(textForView.text.toString() == "แสงเดือน"){
            mp = MediaPlayer.create(this, R.raw.yb_sang_doun)}
        if(textForView.text.toString() == "ลมหนาว"){
            mp = MediaPlayer.create(this, R.raw.lomnaw)}


    }

    fun justPlay(v:View) {
        mp.start()
    }
    fun justPause(v:View) {
        mp.pause()
    }
    fun justReset(v:View) {
        mp.stop()
        mp.prepare()
        mp.start()
    }

    override fun onPause() {
        super.onPause()
        mp.stop()
    }


}