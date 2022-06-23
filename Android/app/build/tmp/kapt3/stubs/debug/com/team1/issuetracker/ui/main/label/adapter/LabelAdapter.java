package com.team1.issuetracker.ui.main.label.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0013\u0014B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u001c\u0010\n\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/team1/issuetracker/ui/main/label/adapter/LabelAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/team1/issuetracker/data/model/Label;", "Lcom/team1/issuetracker/ui/main/label/adapter/LabelAdapter$LabelViewHolder;", "longClick", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "makeCheckBoxGone", "makeCheckBoxVisible", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "LabelDiffUtil", "LabelViewHolder", "app_debug"})
public final class LabelAdapter extends androidx.recyclerview.widget.ListAdapter<com.team1.issuetracker.data.model.Label, com.team1.issuetracker.ui.main.label.adapter.LabelAdapter.LabelViewHolder> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> longClick = null;
    
    public LabelAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> longClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.team1.issuetracker.ui.main.label.adapter.LabelAdapter.LabelViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.ui.main.label.adapter.LabelAdapter.LabelViewHolder holder, int position) {
    }
    
    public final void removeItem(int position) {
    }
    
    public final void makeCheckBoxVisible() {
    }
    
    public final void makeCheckBoxGone() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/team1/issuetracker/ui/main/label/adapter/LabelAdapter$LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/team1/issuetracker/databinding/ItemLabelBinding;", "(Lcom/team1/issuetracker/ui/main/label/adapter/LabelAdapter;Lcom/team1/issuetracker/databinding/ItemLabelBinding;)V", "bind", "", "label", "Lcom/team1/issuetracker/data/model/Label;", "getClamped", "", "setClamped", "isClamped", "app_debug"})
    public final class LabelViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.team1.issuetracker.databinding.ItemLabelBinding binding = null;
        
        public LabelViewHolder(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.databinding.ItemLabelBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Label label) {
        }
        
        public final void setClamped(boolean isClamped) {
        }
        
        public final boolean getClamped() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/team1/issuetracker/ui/main/label/adapter/LabelAdapter$LabelDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/team1/issuetracker/data/model/Label;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class LabelDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.team1.issuetracker.data.model.Label> {
        @org.jetbrains.annotations.NotNull()
        public static final com.team1.issuetracker.ui.main.label.adapter.LabelAdapter.LabelDiffUtil INSTANCE = null;
        
        private LabelDiffUtil() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Label oldItem, @org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Label newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Label oldItem, @org.jetbrains.annotations.NotNull()
        com.team1.issuetracker.data.model.Label newItem) {
            return false;
        }
    }
}