package com.basarcelebi.weatherapp.models

import com.google.gson.annotations.SerializedName

data class HourlyForecast(
    @SerializedName("Date")
    val date:String,
    @SerializedName("EpochDateTime")
    val epochDateTime:Long,
    @SerializedName("WeatherIcon")
    val weatherIcon:Int,
    @SerializedName("IconPhrase")
    val iconPhrase:String,
    @SerializedName("HasPrecipitation")
    val hasPrecipitation:Boolean,
    @SerializedName("IsDayLight")
    val isDayLight:Boolean,
    @SerializedName("Temperature")
    val temperature:Temperature
)