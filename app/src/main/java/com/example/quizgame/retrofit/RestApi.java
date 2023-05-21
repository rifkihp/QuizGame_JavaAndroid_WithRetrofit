package com.example.quizgame.retrofit;

import com.example.quizgame.model.ResponseRequestSoal;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;

public interface RestApi {

    @GET("api/public/soal")
    Call<ResponseRequestSoal> getSoalQuiz();

}