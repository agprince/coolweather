package com.agprincefu.andriod.coolweather.gson;

import android.support.v4.media.session.MediaSessionCompat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by agprincefu on 2018/1/20.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
