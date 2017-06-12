package com.andy.bestbar.data.remote

import com.andy.bestbar.data.model.Information
import com.andy.bestbar.data.model.Venue
import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by andrewjoyce on 06/06/2017.
 */
interface BestBarService {

    @GET("/aj1sd")
    fun getAllVenues(): Single<List<Venue>>

    @GET("bins/")
    fun getAllInformation(): Single<List<Information>>
}