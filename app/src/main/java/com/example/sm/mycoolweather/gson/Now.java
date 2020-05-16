package com.example.sm.mycoolweather.gson;
import com.google.gson.annotations.SerializedName;
/**
 * Created by SM on 2020/5/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}