package com.team1.issuetracker.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/team1/issuetracker/data/repository/MilestoneRepositoryImpl;", "Lcom/team1/issuetracker/data/repository/MilestoneRepository;", "dataSource", "Lcom/team1/issuetracker/data/datasource/MilestoneDataSource;", "(Lcom/team1/issuetracker/data/datasource/MilestoneDataSource;)V", "getMilestone", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/team1/issuetracker/data/model/Milestone;", "app_debug"})
@javax.inject.Singleton()
public final class MilestoneRepositoryImpl implements com.team1.issuetracker.data.repository.MilestoneRepository {
    private final com.team1.issuetracker.data.datasource.MilestoneDataSource dataSource = null;
    
    @javax.inject.Inject()
    public MilestoneRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.datasource.MilestoneDataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.team1.issuetracker.data.model.Milestone>> getMilestone() {
        return null;
    }
}