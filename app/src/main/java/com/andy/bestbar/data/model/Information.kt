package com.andy.bestbar.data.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by andrewjoyce on 06/06/2017.
 */
@Entity(tableName = "information_list")
class Information(@PrimaryKey(autoGenerate = false) @ColumnInfo(name = "information_title") val title: String,
                  @ColumnInfo(name = "information_image") val image: String,
                  @ColumnInfo(name = "information_content") val content: String)