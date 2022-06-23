package com.team1.issuetracker.data.network

import com.team1.issuetracker.data.dto.LabelDTO
import retrofit2.http.GET

interface LabelApi {

    @GET("labels.json")
    suspend fun getLabels(): List<LabelDTO>
}