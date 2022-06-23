package com.team1.issuetracker.ui.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/team1/issuetracker/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/team1/issuetracker/data/repository/LoginRepository;", "(Lcom/team1/issuetracker/data/repository/LoginRepository;)V", "_error", "Lcom/team1/issuetracker/common/SingleLiveEvent;", "", "_jwtLoadCompleteEvent", "", "ceh", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "jwtLoadCompleteEvent", "getJwtLoadCompleteEvent", "loadJwt", "", "authenticationCode", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.team1.issuetracker.data.repository.LoginRepository repository = null;
    private final com.team1.issuetracker.common.SingleLiveEvent _jwtLoadCompleteEvent = null;
    private final com.team1.issuetracker.common.SingleLiveEvent<java.lang.String> _error = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler ceh = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.repository.LoginRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData getJwtLoadCompleteEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    public final void loadJwt(@org.jetbrains.annotations.NotNull()
    java.lang.String authenticationCode) {
    }
}