package com.fnal_etech.n9_final_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SubProject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_project)

        val bundle = intent.extras

        val textForView = findViewById<TextView>(R.id.textForView)
        val detailView = findViewById<TextView>(R.id.DetailView)
        val imgView = findViewById<ImageView>(R.id.img)


//ใสารูป
        if(bundle != null){
            textForView.text = bundle.getString("project")
            detailView.text = bundle.getString("detail")
            if(textForView.text.toString() == "โครงการแกล้งดิน"){
                imgView.setImageResource(R.drawable.image1)}
            if(textForView.text.toString() == "โครงการปลูกหญ้าแฝก"){
                imgView.setImageResource(R.drawable.image2)}
            if(textForView.text.toString() == "โครงการหน่วยแพทย์พระราชทาน"){
                imgView.setImageResource(R.drawable.image3)}
            if(textForView.text.toString() == "โครงการสารานุกรมไทยสำหรับเยาวชน"){
                imgView.setImageResource(R.drawable.image4)}
            if(textForView.text.toString() == "ทุนมูลนิธิอานันทมหิดล"){
                imgView.setImageResource(R.drawable.image5)}
            if(textForView.text.toString() == "แนวคิดเศรษฐกิจพอเพียง : เกษตรทฤษฎีใหม่"){
                imgView.setImageResource(R.drawable.image6)}
            if(textForView.text.toString() == "บทพระราชนิพนธ์เรื่อง พระมหาชนก"){
                imgView.setImageResource(R.drawable.image7)}
            if(textForView.text.toString() == "โครงการส่วนพระองค์สวนจิตรลดา"){
                imgView.setImageResource(R.drawable.image8)}
            if(textForView.text.toString() == "โครงการฝนหลวง"){
                imgView.setImageResource(R.drawable.image9)}
            if(textForView.text.toString() == "กังหันน้ำชัยพัฒนา"){
                imgView.setImageResource(R.drawable.image10)}
        }
    }
}
