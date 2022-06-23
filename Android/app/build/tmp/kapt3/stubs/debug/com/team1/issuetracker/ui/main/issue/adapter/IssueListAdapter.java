package com.team1.issuetracker.ui.main.issue.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0016\u0017B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u001c\u0010\u000e\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/team1/issuetracker/ui/main/issue/adapter/IssueListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/team1/issuetracker/data/model/Issue;", "Lcom/team1/issuetracker/ui/main/issue/adapter/IssueListAdapter$IssueViewHolder;", "longClick", "Lkotlin/Function0;", "", "itemCheck", "Lkotlin/Function1;", "", "closeSwiped", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "makeCheckBosVisible", "makeCheckBoxGone", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "IssueDiffUtil", "IssueViewHolder", "app_debug"})
public final class IssueListAdapter extends androidx.recyclerview.widget.ListAdapter<com.team1.issuetracker.data.model.Issue, com.team1.issuetracker.ui.main.issue.adapter.IssueListAdapter.IssueViewHolder> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> longClick = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemCheck = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> closeSwiped = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.team1.issuetracker.ui.main.issue.adapter.IssueListAdapter.IssueDiffUtil IssueDiffUtil = null;
    
    public IssueListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> longClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemCheck, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> closeSwiped) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.team1.issuetracker.ui.main.issue.adapter.IssueListAdapter.IssueViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.ui.main.issue.adapter.IssueListAdapter.IssueViewHolder holder, int position) {
    }
    
    public final void removeItem(int position) {
    }
    
    public final void makeCheckBosVisible() {
    }
    
    public final void makeCheckBoxGone() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JD\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/team1/issuetracker/ui/main/issue/adapter/IssueListAdapter$IssueViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/team1/issuetracker/databinding/ItemIssueBinding;", "(Lcom/team1/issuetracker/ui/main/issue/adapter/IssueListAdapter;Lcom/team1/issuetracker/databinding/ItemIssueBinding;)V", "bind", "", "issue", "Lcom/team1/issuetracker/data/model/Issue;", "longClick", "Lkotlin/Function0;", "itemCheck", "Lkotlin/Function1;", "", "closeSwiped", "getClamped", "", "setClamped", "isClamped", "app_debug"})
    public final class IssueViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.team1.issuetracker.databinding.ItemIssueBinding binding = null;
        
        public IssueViewHolder(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.databinding.ItemIssueBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Issue issue, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> longClick, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemCheck, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> closeSwiped) {
        }
        
        public final void setClamped(boolean isClamped) {
        }
        
        public final boolean getClamped() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/team1/issuetracker/ui/main/issue/adapter/IssueListAdapter$IssueDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/team1/issuetracker/data/model/Issue;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class IssueDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.team1.issuetracker.data.model.Issue> {
        
        private IssueDiffUtil() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Issue oldItem, @org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Issue newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Issue oldItem, @org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Issue newItem) {
            return false;
        }
    }
}