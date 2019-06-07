package com.example.coolweather.gson;

/**
 * Created by JiangLi on 2019/6/7.
 */

public class AQI {
    public AQICity city;

    public static class AQICity {
        public String aqi;
        public String pm25;
    }
}
