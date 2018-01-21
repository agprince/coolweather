package com.agprincefu.andriod.coolweather.gson;

/**
 * Created by agprincefu on 2018/1/20.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
