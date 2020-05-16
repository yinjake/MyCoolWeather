package com.example.sm.mycoolweather.gson;
import com.google.gson.annotations.SerializedName;
/**
 * Created by SM on 2020/5/16.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
