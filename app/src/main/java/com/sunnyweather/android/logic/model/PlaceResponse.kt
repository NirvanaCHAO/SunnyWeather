package com.sunnyweather.android.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status:String,val places:List<Place>)

data class Place(val name:String,val location: Location1,
                 @SerializedName("formatted_address")val address:String)

data class Location1(val lng:String,val lat:String)