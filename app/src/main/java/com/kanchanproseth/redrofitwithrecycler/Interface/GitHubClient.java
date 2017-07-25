package com.kanchanproseth.redrofitwithrecycler.Interface;

import com.kanchanproseth.redrofitwithrecycler.Data.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by kanchanproseth on 7/25/17.
 */

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);
}
