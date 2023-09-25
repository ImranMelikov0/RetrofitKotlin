package com.imranmelikov.retrofitkotlin

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Delete {
    fun personDelete(remove:Int){
        val response=RetrofitInstance.api.deletePerson(remove)
        response.enqueue(object :Callback<CRUD>{
            override fun onResponse(call: Call<CRUD>, response: Response<CRUD>) {
                if (response.isSuccessful){
                    response.body()?.let {
                        println("----------")
                        println(it.success)
                       println(it.message)
                    }
                }
            }

            override fun onFailure(call: Call<CRUD>, t: Throwable) {
               println("Error")
            }

        })
    }
}