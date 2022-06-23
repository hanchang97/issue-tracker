package com.team1.issuetracker.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/team1/issuetracker/data/repository/LoginRepositoryImpl;", "Lcom/team1/issuetracker/data/repository/LoginRepository;", "dataSource", "Lcom/team1/issuetracker/data/datasource/LoginDataSource;", "appSession", "Lcom/team1/issuetracker/data/AppSession;", "(Lcom/team1/issuetracker/data/datasource/LoginDataSource;Lcom/team1/issuetracker/data/AppSession;)V", "loadJwt", "Lcom/team1/issuetracker/data/model/Jwt;", "authenticationCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveJwt", "", "jwt", "app_debug"})
@javax.inject.Singleton()
public final class LoginRepositoryImpl implements com.team1.issuetracker.data.repository.LoginRepository {
    private final com.team1.issuetracker.data.datasource.LoginDataSource dataSource = null;
    private final com.team1.issuetracker.data.AppSession appSession = null;
    
    @javax.inject.Inject()
    public LoginRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.datasource.LoginDataSource dataSource, @org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.AppSession appSession) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadJwt(@org.jetbrains.annotations.NotNull()
    java.lang.String authenticationCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.team1.issuetracker.data.model.Jwt> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void saveJwt(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.model.Jwt jwt) {
    }
}