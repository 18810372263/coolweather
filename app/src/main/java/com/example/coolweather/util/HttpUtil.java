package com.example.coolweather.util;

import android.util.Log;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by JiangLi on 2019/6/4.
 */

public class HttpUtil {
    public static final String TAG = "HttpUtil";

    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        Log.i(TAG,"send "+ address);
        client.newCall(request).enqueue(callback);
    }
}
