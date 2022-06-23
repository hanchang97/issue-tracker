package com.team1.issuetracker.ui.main.issue;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/team1/issuetracker/ui/main/issue/IssueViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_issueList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/team1/issuetracker/data/model/Issue;", "_itemCount", "", "checkedSet", "", "issueList", "Lkotlinx/coroutines/flow/StateFlow;", "getIssueList", "()Lkotlinx/coroutines/flow/StateFlow;", "itemCount", "getItemCount", "sampleOriginIssueList", "Ljava/util/ArrayList;", "addSampleIssueData", "", "checkItem", "inx", "checkedSetClear", "requestCloseSpecificIssue", "id", "app_debug"})
public final class IssueViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _itemCount = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> itemCount = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.team1.issuetracker.data.model.Issue>> _issueList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.team1.issuetracker.data.model.Issue>> issueList = null;
    private final java.util.ArrayList<com.team1.issuetracker.data.model.Issue> sampleOriginIssueList = null;
    private final java.util.Set<java.lang.Integer> checkedSet = null;
    
    @javax.inject.Inject()
    public IssueViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getItemCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.team1.issuetracker.data.model.Issue>> getIssueList() {
        return null;
    }
    
    public final void checkItem(int inx) {
    }
    
    public final void checkedSetClear() {
    }
    
    public final void requestCloseSpecificIssue(int id) {
    }
    
    private final void addSampleIssueData() {
    }
}