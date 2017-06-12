package com.andy.bestbar.data.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.andy.bestbar.data.model.Information
import com.andy.bestbar.data.model.Venue

/**
 * Created by andrewjoyce on 06/06/2017.
 */

@Dao
interface InformationDao {

    @Query("SELECT * FROM information")
    fun getAllInformation(): List<Information>

    @Query("SELECT * FROM information WHERE title = :title")
    fun getInformationWithTitle(title: String): Information

    @Insert
    fun insertInformation(informationList: List<Information>)

    @Delete
    fun deleteInformation(information: Information)

}