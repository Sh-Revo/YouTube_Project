package com.youtube.config;

import okhttp3.OkHttpClient;

public interface Config {
    int HEIGHT = 600;
    int WIDTH = 1200;

    OkHttpClient client = new OkHttpClient();

    String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    String DATE_FORMAT_SHOW = "dd/L/yyyy 'Time:' HH:mm";
}
