package com.andy.bestbar.data.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.andy.bestbar.data.model.Venue

/**
 * Created by andrewjoyce on 06/06/2017.
 */

@Dao
interface VenueDao {

    @Query("SELECT * FROM venues")
    fun getAllVenues(): List<Venue>

    @Query("SELECT * FROM venues WHERE name :name")
    fun getVenueWithName(venueName: String): Venue

    @Insert
    fun insertVenues(venues: List<Venue>)

    @Delete
    fun deleteVenue(venue: Venue)

}