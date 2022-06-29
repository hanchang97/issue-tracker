package com.team1.issuetracker.data.repository

import com.team1.issuetracker.data.datasource.LabelDataSource
import com.team1.issuetracker.data.dto.toLabels
import com.team1.issuetracker.data.model.Label
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LabelRepositoryImpl @Inject constructor(private val dataSource: LabelDataSource) : LabelRepository {

    override fun getLabels() = flow {
        val list = mutableListOf<Label>()

        dataSource.getLabel().collect { dto ->
            dto.map {
                list.add(it.toLabels())
            }
        }

        emit(list)
    }

}