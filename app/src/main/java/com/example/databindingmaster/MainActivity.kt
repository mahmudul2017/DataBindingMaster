package com.example.databindingmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingmaster.data.Student
import com.example.databindingmaster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)
        activityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

     //   var name = findViewById<TextView>(R.id.tv_name)
     //   var email = findViewById<TextView>(R.id.tv_email)

        var student = Student("Md. Mahmudul Hasan", "mahmudulcse21@gmail.com")
        activityBinding.student = student
      //  name.text = student.studentName
      //  email.text = student.studentEmail
    }
}
