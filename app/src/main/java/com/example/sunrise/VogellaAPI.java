package com.example.sunrise;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VogellaAPI {

    @GET("article.rss")
    Call<RSSFeed> loadRSSFeed();
}
