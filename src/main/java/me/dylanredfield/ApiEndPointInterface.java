package me.dylanredfield;


import retrofit.Call;
import retrofit.http.GET;

public interface ApiEndPointInterface {
    @GET("statecandidateresults/")
    Call<StateResults> getStateResults();
}
