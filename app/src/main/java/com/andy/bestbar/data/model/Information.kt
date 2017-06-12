package com.andy.bestbar.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by andrewjoyce on 06/06/2017.
 */
@Entity(tableName = "information")
data class Information(@PrimaryKey(autoGenerate = false) var title: String = "",
                  var image: String = "",
                  var content: String = "")