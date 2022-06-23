package com.team1.issuetracker.data.datasource

import com.team1.issuetracker.data.model.Label
import com.team1.issuetracker.data.network.LabelApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LabelDataSourceImpl @Inject constructor(private val api: LabelApi) : LabelDataSource {

    override fun getLabel() = flow {
        emit(api.getLabels())
    }
}
