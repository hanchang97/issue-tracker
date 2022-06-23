package com.team1.issuetracker.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u0007\u00a8\u0006\r"}, d2 = {"setClosedIssue", "", "textView", "Landroid/widget/TextView;", "closedIssue", "", "setDate", "editText", "Landroid/widget/EditText;", "viewModel", "Lcom/team1/issuetracker/ui/main/milestone/AddMilestoneViewModel;", "setOpenIssue", "openIssue", "app_debug"})
public final class MilestoneBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setDate"})
    public static final void setDate(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    com.team1.issuetracker.ui.main.milestone.AddMilestoneViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setOpenIssue"})
    public static final void setOpenIssue(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int openIssue) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setClosedIssue"})
    public static final void setClosedIssue(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int closedIssue) {
    }
}