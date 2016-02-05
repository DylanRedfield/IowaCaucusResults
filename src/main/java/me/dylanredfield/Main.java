package me.dylanredfield;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

import java.io.IOException;

public class Main {
    public static final String BASE_URL = "https://www.idpcaucuses.com/api/";

    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiEndPointInterface service = retrofit.create(ApiEndPointInterface.class);

        Call<StateResults> call = service.getStateResults();

        try {
            StateResults results = call.execute().body();
            results.getStateResults().remove(3);
            results.getStateResults().remove(3);

            System.out.print(results.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
