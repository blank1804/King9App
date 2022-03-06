package com.fnal_etech.n9_final_app
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myToolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(myToolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val bn1p = findViewById<ImageButton>(R.id.bn1p)
        val bn1t = findViewById<TextView>(R.id.bn1t)
        val bn2p = findViewById<ImageButton>(R.id.bn2p)
        val bn2t = findViewById<TextView>(R.id.bn2t)
        val bn3p = findViewById<ImageButton>(R.id.bn3p)
        val bn3t = findViewById<TextView>(R.id.bn3t)
        val bn4p = findViewById<ImageButton>(R.id.bn4p)
        val bn4t = findViewById<TextView>(R.id.bn4t)

        val selectSong = View.OnClickListener {
            val intent = Intent(this,MainSong::class.java)
            startActivity(intent)
        }

        val selectLyric = View.OnClickListener {
            val intent = Intent(this,MainLyric::class.java)
            startActivity(intent)
        }

        val selectProject = View.OnClickListener {
            val intent = Intent(this,MainProject::class.java)
            startActivity(intent)
        }
        val selectHistory = View.OnClickListener {
            val intent = Intent(this,MainHistory::class.java)
            startActivity(intent)
        }
        bn1p.setOnClickListener(selectSong)
        bn1t.setOnClickListener(selectSong)

        bn2p.setOnClickListener(selectLyric)
        bn2t.setOnClickListener(selectLyric)

        bn3p.setOnClickListener(selectProject)
        bn3t.setOnClickListener(selectProject)

        bn4p.setOnClickListener(selectHistory)
        bn4t.setOnClickListener(selectHistory)


    }
}