package com.example.sunrise;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class Controller implements Callback<List<Change>> {
    
    static final String BASE_URL = "https://git.eclipse.org/r/";


    @Override
    public void onResponse(Call<List<Change>> call, Response<List<Change>> response) {
        //todo implement me
    }

    @Override
    public void onFailure(Call<List<Change>> call, Throwable t) {
        //todo implement me
    }
}
