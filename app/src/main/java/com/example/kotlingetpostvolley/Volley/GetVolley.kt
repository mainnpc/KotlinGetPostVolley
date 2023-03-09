package com.example.kotlingetpostvolley.Volley

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class GetVolley {
     fun getData(context:Context,url:String) {

        val queue = Volley.newRequestQueue(context)


        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                Log.d("Response","GetData : "+ response.toString())
            },
            { error->
                Toast.makeText(context,"${error.localizedMessage}", Toast.LENGTH_SHORT).show()

            })

        queue.add(stringRequest)
    }
}