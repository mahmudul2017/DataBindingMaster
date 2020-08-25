package com.example.databindingmaster.data

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Student(name: String, email: String): BaseObservable() {

    var studentName = ""
    var studentEmail = ""

    init {
       this.studentName = name
       this.studentEmail = email
    }
}