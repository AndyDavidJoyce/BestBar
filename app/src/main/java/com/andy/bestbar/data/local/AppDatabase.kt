package com.andy.bestbar.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.andy.bestbar.data.model.Information
import com.andy.bestbar.data.model.Venue

/**
 * Created by andrewjoyce on 06/06/2017.
 */
@Database(entities = arrayOf(Venue::class, Information::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun venueDao(): VenueDao
    abstract fun informationDao(): InformationDao
}