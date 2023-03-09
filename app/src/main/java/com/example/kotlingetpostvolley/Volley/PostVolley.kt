package com.example.kotlingetpostvolley.Volley

import android.content.Context
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class PostVolley {
    fun submid(context:Context)
    {
//        val url = "https://canh190802app.000webhostapp.com/aip/user_update.php"

        // Bảng thông tin bài đăng
//        val url = " https://canh190802app.000webhostapp.com/aip/thongtinphong_baidang_insert.php"
//        val url = "https://canh190802app.000webhostapp.com/aip/thongtinphong_baidang_update.php?id=5"
//        val url = "https://canh190802app.000webhostapp.com/aip/thongtinphong_baidang_delete.php?id=6"
        // Bảng thông tin bài đăng end

        //Test Chat
        val url = "https://demozew.000webhostapp.com/Data.php?role=listchat&method=POST"
        //Test Chat End
        val requestQueue = Volley.newRequestQueue(context)
        val stringRequest = object : StringRequest(Request.Method.POST,url,
            Response.Listener {
                    response ->
                        Toast.makeText(context,response,Toast.LENGTH_SHORT).show()

            },
            Response.ErrorListener { error ->
                Toast.makeText(context,error.localizedMessage.toString(),Toast.LENGTH_SHORT).show()

            }
            ){
            override fun getParams():HashMap<String,String>{
                val map = HashMap<String,String>()

                // MockApi Test
//                map["fullname"] = "Bui Anh"
//                map["username"] = "adminu"
//                map["password"] = "adminp"
//                map["cccd"] = "1231231"
//                map["birthday"] = "10/05/2002"
//                map["address"] = "Thai Binh"
//                map["rank"] = "1"
//                map["status"] = "1"
//                map["timecreate"] = "10/03/2023"
                // MockApi Test End
                // =------------------------------------------
//                //ApiPHP Test User Post Update
//                map.put("id","10");
//                map.put("fullname","Cảnh check Update");
//                map.put("phone","123");
//                map.put("email","update@gmail.com222");
//                map.put("password","haianh12322");
//                map.put("rank","1");
//                map.put("diachi","thái bình22");
//                map.put("img","imgabc");
//                map.put("ngaytao","28-2-2023");
//                //ApiPHP Test END
                // = ------- --------------------------
                // API PHP Test thongtinphong_baidang_insert

//                map.put("id_baidang","3")
//                map.put("thongtinphong","Test Delete")
//                map.put("price","100000")
//                map.put("donvi","$")
                // API PHP Test thongtinphong_baidang_insert , update

                //test chat
//                map.put("id","0")
//                map.put("username","test02")
//                map.put("password","test02")
//                map.put("fullname","Bùi Anh")
//                map.put("address","Hà Nội")
//                map.put("birthday","2002/05/10")
//                map.put("cccd","5464564")
//                map.put("rank","3")
//                map.put("status","0")
//                map.put("imguser","img")
//                map.put("timecreate","2023-03-10")
                //-----------------------------
                //$id_chat,$id_user,$id_guest_user,$TimeCreate,$DateCreate
//                map.put("id_chat","0")
//                map.put("id_user","1")
//                map.put("id_guest_user","3")
//                map.put("TimeCreate","22:00")
//                map.put("DateCreate","2023-03-10")


                map.put("id_listchat","0")
                map.put("id_user","2")
                map.put("id_chat","1")
                map.put("id_user_send","2")
                map.put("id_user_receive","1")
                map.put("content","abccc")
                //test chat end
                return map
            }
        }
        requestQueue.add(stringRequest)
    }
}