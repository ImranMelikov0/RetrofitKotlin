package com.imranmelikov.retrofitkotlin

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Insert {
    fun insertPerson(name:String,tel:String){
        val response=RetrofitInstance.api.insertPerson(name,tel)
        response.enqueue(object :Callback<CRUD>{
            override fun onResponse(call: Call<CRUD>, response: Response<CRUD>) {
                if (response.isSuccessful){
                    response.body()?.let {
                        println(it.message)
                        println(it.success)
                    }
                }
            }

            override fun onFailure(call: Call<CRUD>, t: Throwable) {
                println("Error")
            }

        })
    }
}