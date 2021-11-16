package com.example.stc_githupapp.api

import com.example.stc_githupapp.data.model.DetailUserResponse
import com.example.stc_githupapp.data.model.User
import com.example.stc_githupapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("search/users")
    @Headers( "Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers( "Authorization: token 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")
    fun getUserDetail(

        @Path("username") username:String
    ): Call<DetailUserResponse>

@GET("users/{username}/followers")
@Headers( "Authorization: token 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")
fun getFollowers(
    @Path("username") username:String
): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers( "Authorization: token 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")
    fun getFollowing(
        @Path("username") username:String
    ): Call<ArrayList<User>>

}