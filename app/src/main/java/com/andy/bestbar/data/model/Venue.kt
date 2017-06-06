package com.andy.bestbar.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by andrewjoyce on 05/06/2017.
 */
@Entity(tableName = "venues")
data class Venue(@PrimaryKey(autoGenerate = false) @ColumnInfo(name = "venue_name") val name: String,
                 @ColumnInfo(name = "venue_description") val description: String,
                 @ColumnInfo(name = "venue_image") val image: String,
                 @ColumnInfo(name = "venue_address") val address: String,
                 @ColumnInfo(name = "venue_latitude") val latitude: Long,
                 @ColumnInfo(name = "venue_longitude") val longitude: Long,
                 @ColumnInfo(name = "venue_email") val email: String,
                 @ColumnInfo(name = "venue_contact_number") val contactNumber: String,
                 @ColumnInfo(name = "venue_website") val website: String,
                 @ColumnInfo(name = "venue_facebook_url") val facebookUrl: String,
                 @ColumnInfo(name = "venue_twitter_url") val twitterUrl: String,
                 @ColumnInfo(name = "venue_favourited") val favourited: Boolean)