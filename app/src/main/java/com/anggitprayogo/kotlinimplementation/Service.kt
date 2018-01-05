package com.anggitprayogo.kotlinimplementation

import retrofit.http.GET
import retrofit.http.Path
import rx.Observable

/**
 * Created by Anggit on 05/01/2018.
 */
interface Service {

    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Observable<Github>
}