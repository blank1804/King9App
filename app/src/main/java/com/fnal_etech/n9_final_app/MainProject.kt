package com.fnal_etech.n9_final_app

import android.content.Intent
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainProject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_project)

        //เรียกข้อมูล array มาจาก string
        val res: Resources = resources
        val nameProject = res.getStringArray(R.array.list_project)
        val projectDetail = res.getStringArray(R.array.project_detail)


        val projectListContent = findViewById<ListView>(R.id.list_of_project)


        //สร้าง adapter
        //val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nameProject,)

        //แค่จะเปลี่ยน text เป็นสีขาวแต่ยุ่งยากชิบหาย
        val adapter: ArrayAdapter<String?> = object : ArrayAdapter<String?>(
            this, android.R.layout.simple_list_item_1, nameProject
        ) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                val textView = view.findViewById<View>(android.R.id.text1) as TextView

                /*YOUR CHOICE OF COLOR*/textView.setTextColor(Color.WHITE)
                return view
            }
        }

        //ยัด adapter ใส่ listview
        projectListContent.adapter=adapter

        projectListContent.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 1) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 2) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 3) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 4) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 5) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 6) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 7) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 8) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }
            if (position == 9) {
                val intent = Intent(this,SubProject::class.java)
                intent.putExtra("project",nameProject[position])
                intent.putExtra("detail",projectDetail[position])
                startActivity(intent)
            }


        }
    }
}