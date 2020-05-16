package com.example.sm.mycoolweather.gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Created by SM on 2020/5/16.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
