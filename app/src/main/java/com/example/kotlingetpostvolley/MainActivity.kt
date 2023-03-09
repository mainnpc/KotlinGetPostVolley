package com.example.kotlingetpostvolley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.kotlingetpostvolley.Volley.GetVolley
import com.example.kotlingetpostvolley.Volley.PostVolley
import com.example.kotlingetpostvolley.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var getVolley:GetVolley = GetVolley()
    var postVolley = PostVolley()
//    val url:String = "https://63f9b72e897af748dcc26fb8.mockapi.io/data/user"
        val url:String = "https://demozew.000webhostapp.com/Data.php?role=chat&method=GET"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postVolley.submid(this@MainActivity)
        getVolley.getData(this@MainActivity,url)

    }


}