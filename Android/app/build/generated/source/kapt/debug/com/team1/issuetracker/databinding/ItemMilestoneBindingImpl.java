package com.team1.issuetracker.databinding;
import com.team1.issuetracker.R;
import com.team1.issuetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMilestoneBindingImpl extends ItemMilestoneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.erase_item_view, 6);
        sViewsWithIds.put(R.id.gl_h_30, 7);
        sViewsWithIds.put(R.id.iv_close, 8);
        sViewsWithIds.put(R.id.empty_view_1_1, 9);
        sViewsWithIds.put(R.id.tv_close, 10);
        sViewsWithIds.put(R.id.milestone_view, 11);
        sViewsWithIds.put(R.id.cl_checkbox, 12);
        sViewsWithIds.put(R.id.checkbox, 13);
        sViewsWithIds.put(R.id.empty_view_start, 14);
        sViewsWithIds.put(R.id.gl_v_95_56, 15);
        sViewsWithIds.put(R.id.empty_view_1, 16);
        sViewsWithIds.put(R.id.tv_milestone_progress, 17);
        sViewsWithIds.put(R.id.view_for_content, 18);
        sViewsWithIds.put(R.id.empty_view_2, 19);
        sViewsWithIds.put(R.id.empty_view_3, 20);
        sViewsWithIds.put(R.id.iv_calendar, 21);
        sViewsWithIds.put(R.id.empty_view_4, 22);
        sViewsWithIds.put(R.id.cv_open_badge, 23);
        sViewsWithIds.put(R.id.cv_closed_badge, 24);
        sViewsWithIds.put(R.id.empty_view_5, 25);
        sViewsWithIds.put(R.id.view_line, 26);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMilestoneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ItemMilestoneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[25]
            , (android.view.View) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[1]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[26]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.tvDate.setTag(null);
        this.tvMilestoneContent.setTag(null);
        this.tvMilestoneTitle.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.team1.issuetracker.data.model.Milestone) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.team1.issuetracker.data.model.Milestone Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
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
        com.team1.issuetracker.data.model.Milestone item = mItem;
        java.lang.String itemTitle = null;
        java.lang.String itemDate = null;
        int itemOpen = 0;
        java.lang.String itemContent = null;
        int itemClosed = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.date
                    itemDate = item.getDate();
                    // read item.open
                    itemOpen = item.getOpen();
                    // read item.content
                    itemContent = item.getContent();
                    // read item.closed
                    itemClosed = item.getClosed();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.team1.issuetracker.common.MilestoneBindingAdapterKt.setOpenIssue(this.mboundView4, itemOpen);
            com.team1.issuetracker.common.MilestoneBindingAdapterKt.setClosedIssue(this.mboundView5, itemClosed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, itemDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMilestoneContent, itemContent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMilestoneTitle, itemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}