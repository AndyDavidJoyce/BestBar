package com.andy.bestbar.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by andrewjoyce on 05/06/2017.
 */
@Entity(tableName = "venues")
data class Venue(@PrimaryKey(autoGenerate = false) var name: String = "",
                 var type: String = "",
                 var description: String = "",
                 var image: String = "",
                 var address: String = "",
                 var latitude: Long = 0,
                 var longitude: Long = 0,
                 var email: String = "",
                 var contactNumber: String = "",
                 var website: String = "",
                 var facebookUrl: String = "",
                 var twitterUrl: String = "",
                 var favourited: Boolean = false)