package com.fnal_etech.n9_final_app
import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.graphics.Color
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
class MainLyric : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lyric)

        //เรียกข้อมูล array มาจาก string
        val res: Resources = resources
        val nameSong = res.getStringArray(R.array.list_song)
        val fullLyric = res.getStringArray(R.array.lyric_full)
        val songListContent = findViewById<ListView>(R.id.list_of_lyric)

        //สร้าง adapter
        // val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameSong)

        //แค่จะเปลี่ยน text เป็นสีขาวแต่ยุ่งยากชิบหาย
        val adapter: ArrayAdapter<String?> = object : ArrayAdapter<String?>(
            this, android.R.layout.simple_list_item_1, nameSong
        ) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                val textView = view.findViewById<View>(android.R.id.text1) as TextView

                /*YOUR CHOICE OF COLOR*/textView.setTextColor(Color.WHITE)
                return view
            }
        }



        //ยัด adapter ใส่ listview
        songListContent.adapter=adapter

        songListContent.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 1) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 2) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 3) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 4) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 5) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 6) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 7) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 8) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
            if (position == 9) {
                val intent = Intent(this,SubLyric::class.java)
                intent.putExtra("song",nameSong[position])
                intent.putExtra("full_lyric",fullLyric[position])
                startActivity(intent)
            }
        }



    }
}