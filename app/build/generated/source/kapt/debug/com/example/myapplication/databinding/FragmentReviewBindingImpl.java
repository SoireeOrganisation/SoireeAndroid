package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReviewBindingImpl extends FragmentReviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.table_layout, 1);
        sViewsWithIds.put(R.id.none_text, 2);
        sViewsWithIds.put(R.id.poor_text, 3);
        sViewsWithIds.put(R.id.bad_text, 4);
        sViewsWithIds.put(R.id.normal_text, 5);
        sViewsWithIds.put(R.id.good_text, 6);
        sViewsWithIds.put(R.id.excellent_text, 7);
        sViewsWithIds.put(R.id.button_submit, 8);
        sViewsWithIds.put(R.id.status_text_view, 9);
        sViewsWithIds.put(R.id.progress_bar, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentReviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (com.google.android.material.textview.MaterialTextView) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (android.widget.ProgressBar) bindings[10]
            , (com.google.android.material.textview.MaterialTextView) bindings[9]
            , (android.widget.TableLayout) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}