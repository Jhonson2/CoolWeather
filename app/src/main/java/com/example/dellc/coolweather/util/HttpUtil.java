package com.example.dellc.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 从服务器获取数据okHttpRequest
 * <p>
 * Created by dellc on 2017/6/7.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
