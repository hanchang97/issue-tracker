package com.team1.issuetracker.ui.main.milestone;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/team1/issuetracker/ui/main/milestone/MilestoneViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/team1/issuetracker/data/repository/MilestoneRepository;", "(Lcom/team1/issuetracker/data/repository/MilestoneRepository;)V", "_milestoneList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/team1/issuetracker/data/model/Milestone;", "milestoneList", "getMilestoneList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLabel", "", "app_debug"})
public final class MilestoneViewModel extends androidx.lifecycle.ViewModel {
    private final com.team1.issuetracker.data.repository.MilestoneRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.team1.issuetracker.data.model.Milestone>> _milestoneList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.team1.issuetracker.data.model.Milestone>> milestoneList = null;
    
    @javax.inject.Inject()
    public MilestoneViewModel(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.data.repository.MilestoneRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.team1.issuetracker.data.model.Milestone>> getMilestoneList() {
        return null;
    }
    
    private final void getLabel() {
    }
}