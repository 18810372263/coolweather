package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JiangLi on 2019/6/7.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public UpdateBean update;

    public static class UpdateBean {
       @SerializedName("loc")
        public String updateTime;
        }
}
