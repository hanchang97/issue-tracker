package com.team1.issuetracker.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/team1/issuetracker/data/di/NetWorkModule;", "", "()V", "BASE_URL", "", "URL", "provideAuthApi", "Lcom/team1/issuetracker/data/network/AuthApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideLabelApi", "Lcom/team1/issuetracker/data/network/LabelApi;", "provideMilestoneApi", "Lcom/team1/issuetracker/data/network/MilestoneApi;", "provideOkHttpClient", "app_debug"})
@dagger.Module()
public final class NetWorkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.team1.issuetracker.data.di.NetWorkModule INSTANCE = null;
    private static final java.lang.String BASE_URL = "http://3.34.47.60:8080";
    private static final java.lang.String URL = "https://issuetracker-63f74-default-rtdb.asia-southeast1.firebasedatabase.app/";
    
    private NetWorkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "login")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.team1.issuetracker.data.network.AuthApi provideAuthApi(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "login")
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.team1.issuetracker.data.network.LabelApi provideLabelApi(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "login")
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.team1.issuetracker.data.network.MilestoneApi provideMilestoneApi(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "login")
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}