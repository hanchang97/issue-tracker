package com.team1.issuetracker.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/team1/issuetracker/data/di/DataSourceModule;", "", "()V", "bindAuthDataSource", "Lcom/team1/issuetracker/data/datasource/LoginDataSource;", "authDataSourceImpl", "Lcom/team1/issuetracker/data/datasource/LoginDataSourceImpl;", "bindLabelDataSource", "Lcom/team1/issuetracker/data/datasource/LabelDataSource;", "labelDataSourceImpl", "Lcom/team1/issuetracker/data/datasource/LabelDataSourceImpl;", "bindMilestoneDataSource", "Lcom/team1/issuetracker/data/datasource/MilestoneDataSource;", "milestoneDataSourceImpl", "Lcom/team1/issuetracker/data/datasource/MilestoneDataSourceImpl;", "app_debug"})
@dagger.Module()
public abstract class DataSourceModule {
    
    public DataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.team1.issuetracker.data.datasource.LoginDataSource bindAuthDataSource(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.datasource.LoginDataSourceImpl authDataSourceImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.team1.issuetracker.data.datasource.LabelDataSource bindLabelDataSource(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.datasource.LabelDataSourceImpl labelDataSourceImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.team1.issuetracker.data.datasource.MilestoneDataSource bindMilestoneDataSource(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.datasource.MilestoneDataSourceImpl milestoneDataSourceImpl);
}