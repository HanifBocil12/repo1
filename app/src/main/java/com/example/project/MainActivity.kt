package com.example.project

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project.databinding.ActivityMainBelajarBinding
import com.example.project.databinding.ToatBinding;
import com.google.firebase.Firebase
import java.util.Collections

class MainActivity : AppCompatActivity() {

    private lateinit var firebse:Firebase;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBelajarBinding.inflate(layoutInflater)
        val ding = ToatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var count = 0;
        var result = 0;

        binding.button.setOnClickListener()
        {
            val fristname = binding.firstnm.text.toString().toInt();
            val lastname = binding.lastnm.text.toString().toInt();

            result = fristname + lastname
            binding.textView2.text = result.toString()
            if (result == 1)
            {
                binding.imgAngka.setImageResource(R.drawable.one)
            }else if(result == 2)
            {
                binding.imgAngka.setImageResource(R.drawable.two)
            }
            else if (result == 3)
            {
                binding.imgAngka.setImageResource(R.drawable.three)
            }
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.toat,ding.clToast)
                show()
            }
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