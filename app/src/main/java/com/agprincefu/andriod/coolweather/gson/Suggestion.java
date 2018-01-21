package com.agprincefu.andriod.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by agprincefu on 2018/1/20.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort Comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;

    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
