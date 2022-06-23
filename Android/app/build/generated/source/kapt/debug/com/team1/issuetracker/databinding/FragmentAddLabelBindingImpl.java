package com.team1.issuetracker.databinding;
import com.team1.issuetracker.R;
import com.team1.issuetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddLabelBindingImpl extends FragmentAddLabelBinding implements com.team1.issuetracker.generated.callback.OnTextChanged.Listener, com.team1.issuetracker.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lo_appbar, 4);
        sViewsWithIds.put(R.id.topAppBar, 5);
        sViewsWithIds.put(R.id.view_title, 6);
        sViewsWithIds.put(R.id.tv_title_label, 7);
        sViewsWithIds.put(R.id.view_description, 8);
        sViewsWithIds.put(R.id.tv_description_label, 9);
        sViewsWithIds.put(R.id.view_date, 10);
        sViewsWithIds.put(R.id.tv_background_label, 11);
        sViewsWithIds.put(R.id.btn_color_change, 12);
        sViewsWithIds.put(R.id.view_last, 13);
        sViewsWithIds.put(R.id.line, 14);
        sViewsWithIds.put(R.id.cv_badge_label, 15);
        sViewsWithIds.put(R.id.tv_badge_label, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback1;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddLabelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentAddLabelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.view.View) bindings[14]
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[6]
            );
        this.etBackground.setTag(null);
        this.etDescription.setTag(null);
        this.etTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.team1.issuetracker.generated.callback.OnTextChanged(this, 1);
        mCallback2 = new com.team1.issuetracker.generated.callback.AfterTextChanged(this, 2);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.team1.issuetracker.ui.main.label.AddLabelViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.team1.issuetracker.ui.main.label.AddLabelViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        com.team1.issuetracker.ui.main.label.AddLabelViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.team1.issuetracker.common.LabelBindingAdapterKt.setLabelColor(this.etBackground, viewModel);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback2, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback1, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        // localize variables for thread safety
        // viewModel
        com.team1.issuetracker.ui.main.label.AddLabelViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {






            viewModel.onTitleTextWatcher(callbackArg_0, callbackArg_1, callbackArg_2, callbackArg_3);
        }
    }
    public final void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.team1.issuetracker.ui.main.label.AddLabelViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.onDescriptionTextWatcher(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}