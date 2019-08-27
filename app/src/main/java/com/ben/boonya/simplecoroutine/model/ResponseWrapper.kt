package com.ben.boonya.simplecoroutine.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Boonya Kitpitak on 10/28/18.
 */
data class ResponseWrapper<T>(@SerializedName("resultCount") val resultCount: Int, @SerializedName("results") val result: List<T>)