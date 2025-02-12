package com.example.frontend.service

import com.example.frontend.dto.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
//    @FormUrlEncoded
//    @POST("/signup") // Spring Boot 서버의 API 엔드포인트 경로로 변경
//    fun signup(
//        @Field("id") id: String,
//        @Field("password") password: String,
//        @Field("email") email: String,
//        @Field("phone") phone: String
//    ): Call<ResponseBody>
@POST("signup") // Spring Boot 서버의 API 엔드포인트 경로로 변경
fun signup(
 @Body user: User
): Call<User>
}