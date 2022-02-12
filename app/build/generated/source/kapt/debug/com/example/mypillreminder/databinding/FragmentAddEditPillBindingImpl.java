package com.example.mypillreminder.databinding;
import com.example.mypillreminder.R;
import com.example.mypillreminder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddEditPillBindingImpl extends FragmentAddEditPillBinding implements com.example.mypillreminder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.holderInterval, 7);
        sViewsWithIds.put(R.id.reminder_text, 8);
        sViewsWithIds.put(R.id.quantityViewInterval, 9);
        sViewsWithIds.put(R.id.holderReminder, 10);
        sViewsWithIds.put(R.id.interval_text, 11);
        sViewsWithIds.put(R.id.holderImage, 12);
        sViewsWithIds.put(R.id.image_text, 13);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener reminderTitleandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel._titleEditText.getValue()
            //         is viewModel._titleEditText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(reminderTitle);
            // localize variables for thread safety
            // viewModel._titleEditText.getValue()
            java.lang.String viewModelTitleEditTextGetValue = null;
            // viewModel._titleEditText != null
            boolean viewModelTitleEditTextJavaLangObjectNull = false;
            // viewModel._titleEditText
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTitleEditText = null;
            // viewModel
            com.example.mypillreminder.features.addeditpill.AddEditPillViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTitleEditText = viewModel.get_titleEditText();

                viewModelTitleEditTextJavaLangObjectNull = (viewModelTitleEditText) != (null);
                if (viewModelTitleEditTextJavaLangObjectNull) {




                    viewModelTitleEditText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener switchReminderandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel._switchReminder.getValue()
            //         is viewModel._switchReminder.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = switchReminder.isChecked();
            // localize variables for thread safety
            // viewModel._switchReminder
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSwitchReminder = null;
            // viewModel._switchReminder != null
            boolean viewModelSwitchReminderJavaLangObjectNull = false;
            // viewModel
            com.example.mypillreminder.features.addeditpill.AddEditPillViewModel viewModel = mViewModel;
            // viewModel._switchReminder.getValue()
            java.lang.Boolean viewModelSwitchReminderGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSwitchReminder = viewModel.get_switchReminder();

                viewModelSwitchReminderJavaLangObjectNull = (viewModelSwitchReminder) != (null);
                if (viewModelSwitchReminderJavaLangObjectNull) {




                    viewModelSwitchReminder.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddEditPillBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentAddEditPillBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.ScrollView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (me.himanshusoni.quantityview.QuantityView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            );
        this.btnCancel.setTag(null);
        this.btnSave.setTag(null);
        this.edtPillName.setTag(null);
        this.reminderTitle.setTag(null);
        this.removeText.setTag(null);
        this.switchReminder.setTag(null);
        this.uploadProfilePictureImageView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.example.mypillreminder.features.addeditpill.AddEditPillViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.mypillreminder.features.addeditpill.AddEditPillViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImagePath((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelTitleEditText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelSwitchReminder((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImagePath(androidx.lifecycle.LiveData<java.lang.String> ViewModelImagePath, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTitleEditText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTitleEditText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSwitchReminder(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSwitchReminder, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
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
        java.lang.String viewModelImagePathGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSwitchReminderGetValue = false;
        androidx.lifecycle.LiveData<java.lang.String> viewModelImagePath = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTitleEditText = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSwitchReminder = null;
        java.lang.String viewModelTitleEditTextGetValue = null;
        com.example.mypillreminder.features.addeditpill.AddEditPillViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelSwitchReminderGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imagePath
                        viewModelImagePath = viewModel.getImagePath();
                    }
                    updateLiveDataRegistration(0, viewModelImagePath);


                    if (viewModelImagePath != null) {
                        // read viewModel.imagePath.getValue()
                        viewModelImagePathGetValue = viewModelImagePath.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel._titleEditText
                        viewModelTitleEditText = viewModel.get_titleEditText();
                    }
                    updateLiveDataRegistration(1, viewModelTitleEditText);


                    if (viewModelTitleEditText != null) {
                        // read viewModel._titleEditText.getValue()
                        viewModelTitleEditTextGetValue = viewModelTitleEditText.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel._switchReminder
                        viewModelSwitchReminder = viewModel.get_switchReminder();
                    }
                    updateLiveDataRegistration(2, viewModelSwitchReminder);


                    if (viewModelSwitchReminder != null) {
                        // read viewModel._switchReminder.getValue()
                        viewModelSwitchReminderGetValue = viewModelSwitchReminder.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel._switchReminder.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSwitchReminderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSwitchReminderGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnCancel.setOnClickListener(mCallback3);
            this.btnSave.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.reminderTitle, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, reminderTitleandroidTextAttrChanged);
            this.removeText.setOnClickListener(mCallback2);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.switchReminder, (android.widget.CompoundButton.OnCheckedChangeListener)null, switchReminderandroidCheckedAttrChanged);
            this.uploadProfilePictureImageView.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.reminderTitle, viewModelTitleEditTextGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switchReminder, androidxDatabindingViewDataBindingSafeUnboxViewModelSwitchReminderGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.example.mypillreminder.view.adapter.BindingAdapterKt.bindPillImage(this.uploadProfilePictureImageView, viewModelImagePathGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.mypillreminder.features.addeditpill.AddEditPillViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onSaveClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.mypillreminder.features.addeditpill.AddEditPillViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onImageDeleteClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.mypillreminder.features.addeditpill.AddEditPillViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onCancelClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.mypillreminder.features.addeditpill.AddEditPillViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onSelectImageClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.imagePath
        flag 1 (0x2L): viewModel._titleEditText
        flag 2 (0x3L): viewModel._switchReminder
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}