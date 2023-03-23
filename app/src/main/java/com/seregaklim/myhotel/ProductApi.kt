package com.seregaklim.myhotel

import retrofit2.http.GET
import retrofit2.http.Path


interface ProductApi {
//    @GET("products/{id}")
//    suspend fun getProductById(@Path("id") id: Int): Product


    @GET("/products/categories")
    suspend fun getProductById():ArrayList<String>




//
//    @GET("products/1")
//    suspend fun getProductById(): Product


//
//    @GET("/breeds")
//    suspend fun getProductById(): Ticket

//



}