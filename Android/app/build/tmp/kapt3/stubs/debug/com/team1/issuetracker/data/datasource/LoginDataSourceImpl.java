package com.team1.issuetracker.data.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/team1/issuetracker/data/datasource/LoginDataSourceImpl;", "Lcom/team1/issuetracker/data/datasource/LoginDataSource;", "authApi", "Lcom/team1/issuetracker/data/network/AuthApi;", "(Lcom/team1/issuetracker/data/network/AuthApi;)V", "loadJwt", "Lcom/team1/issuetracker/data/dto/JwtDTO;", "authenticationCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class LoginDataSourceImpl implements com.team1.issuetracker.data.datasource.LoginDataSource {
    private final com.team1.issuetracker.data.network.AuthApi authApi = null;
    
    @javax.inject.Inject()
    public LoginDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.network.AuthApi authApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadJwt(@org.jetbrains.annotations.NotNull()
    java.lang.String authenticationCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.team1.issuetracker.data.dto.JwtDTO> continuation) {
        return null;
    }
}