package com.example.draggerhilt.data.api

import com.example.draggerhilt.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}