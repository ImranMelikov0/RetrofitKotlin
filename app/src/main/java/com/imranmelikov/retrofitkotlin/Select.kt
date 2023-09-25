package com.imranmelikov.retrofitkotlin

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Select {
    fun personSelect(){
        val response = RetrofitInstance.api.getData()
        response.enqueue(
            object : Callback<Persons> {
                override fun onResponse(call: Call<Persons>, response: Response<Persons>) {
                    if (response.isSuccessful) {
                        response.body()?.let {
                            it.kisiler.map {
                                println("******")
                                println(it.kisi_ad)
                                println(it.kisi_tel)
                                println(it.kisi_id)
                            }

                        }
                    }
                }

                override fun onFailure(call: Call<Persons>, t: Throwable) {
                    println("Error")
                }

            })
    }
}