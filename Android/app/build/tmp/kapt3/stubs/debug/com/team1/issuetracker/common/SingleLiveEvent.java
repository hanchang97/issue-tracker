package com.team1.issuetracker.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\b\b\u0000\u0012\u0004\u0018\u00018\u00000\rH\u0016J\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/team1/issuetracker/common/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "value", "(Ljava/lang/Object;)V", "pendingValue", "Ljava/util/concurrent/atomic/AtomicBoolean;", "call", "", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "postValue", "setValue", "app_debug"})
public final class SingleLiveEvent<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
    private final java.util.concurrent.atomic.AtomicBoolean pendingValue = null;
    
    public SingleLiveEvent() {
        super(null);
    }
    
    public SingleLiveEvent(@org.jetbrains.annotations.Nullable()
    T value) {
        super(null);
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.Nullable()
    T value) {
    }
    
    @java.lang.Override()
    public void postValue(T value) {
    }
    
    @java.lang.Override()
    public void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    public final void call() {
    }
}