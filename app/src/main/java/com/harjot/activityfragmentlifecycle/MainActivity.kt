package com.harjot.activityfragmentlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.harjot.activityfragmentlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this, "OnCreate Method", Toast.LENGTH_SHORT).show()
        binding.btnFragment.setOnClickListener {
            var intent = Intent(this,FragmentActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart Method", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume Method", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause Method", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop Method", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "OnRestart Method", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy Method", Toast.LENGTH_SHORT).show()
    }
}