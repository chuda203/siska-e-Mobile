package com.nusatek.siska_e

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nusatek.siska_e.databinding.ActivityOptionBinding
import com.nusatek.siska_e.student.LoginActivity as StudentLoginActivity
import com.nusatek.siska_e.lecturer.LoginActivity as LecturerLoginActivity

class OptionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btStudent.setOnClickListener {
            val intent = Intent(this, StudentLoginActivity::class.java)
            startActivity(intent)
        }
        binding.btLecturer.setOnClickListener {
            val intent = Intent(this, LecturerLoginActivity::class.java)
            startActivity(intent)
        }
    }
}