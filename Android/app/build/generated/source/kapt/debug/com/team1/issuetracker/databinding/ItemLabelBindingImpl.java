package com.team1.issuetracker.databinding;
import com.team1.issuetracker.R;
import com.team1.issuetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLabelBindingImpl extends ItemLabelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.erase_item_view, 4);
        sViewsWithIds.put(R.id.gl_h_30, 5);
        sViewsWithIds.put(R.id.iv_close, 6);
        sViewsWithIds.put(R.id.empty_view_1_1, 7);
        sViewsWithIds.put(R.id.tv_close, 8);
        sViewsWithIds.put(R.id.label_view, 9);
        sViewsWithIds.put(R.id.cl_checkbox, 10);
        sViewsWithIds.put(R.id.checkbox, 11);
        sViewsWithIds.put(R.id.empty_view_start, 12);
        sViewsWithIds.put(R.id.gl_v_95_56, 13);
        sViewsWithIds.put(R.id.empty_view_1, 14);
        sViewsWithIds.put(R.id.view_for_content, 15);
        sViewsWithIds.put(R.id.empty_view_4, 16);
        sViewsWithIds.put(R.id.empty_view_5, 17);
        sViewsWithIds.put(R.id.view_line, 18);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLabelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ItemLabelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (android.widget.ImageView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[18]
            );
        this.cvLabel.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvIssueContent.setTag(null);
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
            setItem((com.team1.issuetracker.data.model.Label) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.team1.issuetracker.data.model.Label Item) {
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
        com.team1.issuetracker.data.model.Label item = mItem;
        java.lang.String itemTitle = null;
        java.lang.String itemColor = null;
        java.lang.String itemDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.color
                    itemColor = item.getColor();
                    // read item.description
                    itemDescription = item.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.team1.issuetracker.common.LabelBindingAdapterKt.setLabelColor(this.cvLabel, itemColor);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvIssueContent, itemDescription);
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