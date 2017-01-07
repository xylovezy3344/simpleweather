package com.xiaoyu.simpleweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 天气实体类
 * Created by xiaoyu on 17-1-7.
 */

public class Weather {

    public String status;

    public Basic basic;

    public Aqi aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
