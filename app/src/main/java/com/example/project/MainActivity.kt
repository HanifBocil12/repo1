package com.example.project

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.project.databinding.ActivityMainBelajarBinding
import com.google.firebase.Firebase
import com.google.firebase.database.database
import java.util.Collections

class MainActivity : AppCompatActivity() {

    private lateinit var firebse:Firebase;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBelajarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var count = 0;
        binding.button.setOnClickListener()
        {
            val fristname = binding.firstnm.text.toString().toInt();
            val lastname = binding.lastnm.text.toString().toInt();

            val result = fristname + lastname
            binding.textView2.text = result.toString()
        }
//        binding.input.setOnClickListener()
//        {
//            count++
//            binding.password.setText("kpp")
//        }

        val list = listOf(5,3,1,6)
        sortlist(list)
        println(list)
//        firebse.database.reference.key
    }

    private fun sortlist(list: List<Int>){
        for (i in  0..list.size - 1)
        {
            for (j in 0..list.size - 2)
            {
                if (list[j] > list[j+1])
                {
                    Collections.swap(list,j,j+1)
                }
            }
        }
    }
}