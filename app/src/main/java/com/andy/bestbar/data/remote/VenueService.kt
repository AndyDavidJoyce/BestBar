package com.andy.bestbar.data.remote

import com.andy.bestbar.data.model.Venue
import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by andrewjoyce on 06/06/2017.
 */
interface VenueService {

    @GET("")
    fun getAllVenues(): Single<List<Venue>>

    @GET("")
    fun getAllInformation(): Single<List<Venue>>
}