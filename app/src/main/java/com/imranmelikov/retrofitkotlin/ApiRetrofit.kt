package com.imranmelikov.retrofitkotlin

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiRetrofit {
    @GET("tum_kisiler.php")
    fun getData():Call<Persons>
    @POST("tum_kisiler_arama.php")
    @FormUrlEncoded
    fun searchData(
        @Field("kisi_ad") person_ad:String
    ):Call<Persons>
    @POST("delete_kisiler.php")
    @FormUrlEncoded
    fun deletePerson(
        @Field("kisi_id") remove:Int
    ):Call<CRUD>
    @POST("insert_kisiler.php")
    @FormUrlEncoded
    fun insertPerson(
        @Field("kisi_ad") name:String,
        @Field("kisi_tel") tel:String
    ):Call<CRUD>
    @POST("update_kisiler.php")
    @FormUrlEncoded
    fun updatePerson(
        @Field("kisi_id") id:Int,
        @Field("kisi_ad") name:String,
        @Field("kisi_tel") tel:String
    ):Call<CRUD>
}