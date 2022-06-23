package com.team1.issuetracker.databinding;
import com.team1.issuetracker.R;
import com.team1.issuetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemIssueBindingImpl extends ItemIssueBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.erase_item_view, 5);
        sViewsWithIds.put(R.id.gl_h_30, 6);
        sViewsWithIds.put(R.id.iv_close, 7);
        sViewsWithIds.put(R.id.empty_view_1_1, 8);
        sViewsWithIds.put(R.id.tv_close, 9);
        sViewsWithIds.put(R.id.swipe_view, 10);
        sViewsWithIds.put(R.id.cl_checkbox, 11);
        sViewsWithIds.put(R.id.checkbox, 12);
        sViewsWithIds.put(R.id.empty_view_start, 13);
        sViewsWithIds.put(R.id.gl_v_95_56, 14);
        sViewsWithIds.put(R.id.empty_view_1, 15);
        sViewsWithIds.put(R.id.iv_milestone, 16);
        sViewsWithIds.put(R.id.empty_view_2, 17);
        sViewsWithIds.put(R.id.empty_view_3, 18);
        sViewsWithIds.put(R.id.view_for_content, 19);
        sViewsWithIds.put(R.id.empty_view_4, 20);
        sViewsWithIds.put(R.id.cv_label, 21);
        sViewsWithIds.put(R.id.view_top, 22);
        sViewsWithIds.put(R.id.view_start, 23);
        sViewsWithIds.put(R.id.view_end, 24);
        sViewsWithIds.put(R.id.view_bottom, 25);
        sViewsWithIds.put(R.id.empty_view_5, 26);
        sViewsWithIds.put(R.id.view_line, 27);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemIssueBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ItemIssueBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (com.google.android.material.card.MaterialCardView) bindings[21]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[26]
            , (android.view.View) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[14]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[25]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[22]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvIssueContent.setTag(null);
        this.tvLabel.setTag(null);
        this.tvMilestone.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.issue == variableId) {
            setIssue((com.team1.issuetracker.data.model.Issue) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIssue(@Nullable com.team1.issuetracker.data.model.Issue Issue) {
        this.mIssue = Issue;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.issue);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String issueTitle = null;
        java.lang.String issueContent = null;
        com.team1.issuetracker.data.model.Issue issue = mIssue;
        java.lang.String issueMileStone = null;
        java.lang.String issueLabelContent = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (issue != null) {
                    // read issue.title
                    issueTitle = issue.getTitle();
                    // read issue.content
                    issueContent = issue.getContent();
                    // read issue.mileStone
                    issueMileStone = issue.getMileStone();
                    // read issue.labelContent
                    issueLabelContent = issue.getLabelContent();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvIssueContent, issueContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLabel, issueLabelContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMilestone, issueMileStone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, issueTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): issue
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}