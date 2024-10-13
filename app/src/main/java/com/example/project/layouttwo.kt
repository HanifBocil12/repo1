package com.example.project

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project.databinding.*

class layouttwo: AppCompatActivity() {
    val bin = LayoutAsliBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.layout_asli)
        bin.judul
    }
}