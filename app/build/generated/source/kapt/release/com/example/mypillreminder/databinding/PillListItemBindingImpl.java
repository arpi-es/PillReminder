package com.example.mypillreminder.databinding;
import com.example.mypillreminder.R;
import com.example.mypillreminder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PillListItemBindingImpl extends PillListItemBinding implements com.example.mypillreminder.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PillListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private PillListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            );
        this.btnAlreadyTaken.setTag(null);
        this.btnSkip.setTag(null);
        this.btnTake.setTag(null);
        this.imgPoster.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.pillAlarm.setTag(null);
        this.textViewOptions.setTag(null);
        this.txtInterval.setTag(null);
        this.txtLastTaken.setTag(null);
        this.txtNextDose.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 4);
        mCallback6 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 2);
        mCallback7 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 3);
        mCallback5 = new com.example.mypillreminder.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.pill == variableId) {
            setPill((com.example.mypillreminder.service.model.Pill) variable);
        }
        else if (BR.viewHolder == variableId) {
            setViewHolder((com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPill(@Nullable com.example.mypillreminder.service.model.Pill Pill) {
        this.mPill = Pill;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.pill);
        super.requestRebind();
    }
    public void setViewHolder(@Nullable com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder ViewHolder) {
        this.mViewHolder = ViewHolder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewHolder);
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
        java.lang.String pillLastTakenFormatted = null;
        boolean pillHasReminder = false;
        com.example.mypillreminder.service.model.Pill pill = mPill;
        java.lang.String pillPillImage = null;
        java.lang.String pillNextDoseFormatted = null;
        java.lang.String txtNextDoseAndroidStringPillNextDoseDatePillNextDoseFormatted = null;
        java.lang.String txtIntervalAndroidStringPillIntervalPillInterval = null;
        java.lang.String pillPillName = null;
        int pillInterval = 0;
        com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder viewHolder = mViewHolder;
        java.lang.String txtLastTakenAndroidStringPillLastTakenDatePillLastTakenFormatted = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (pill != null) {
                    // read pill.lastTakenFormatted()
                    pillLastTakenFormatted = pill.lastTakenFormatted();
                    // read pill.hasReminder
                    pillHasReminder = pill.getHasReminder();
                    // read pill.pillImage
                    pillPillImage = pill.getPillImage();
                    // read pill.nextDoseFormatted()
                    pillNextDoseFormatted = pill.nextDoseFormatted();
                    // read pill.pillName
                    pillPillName = pill.getPillName();
                    // read pill.interval
                    pillInterval = pill.getInterval();
                }


                // read @android:string/pill_lastTaken_date
                txtLastTakenAndroidStringPillLastTakenDatePillLastTakenFormatted = txtLastTaken.getResources().getString(R.string.pill_lastTaken_date, pillLastTakenFormatted);
                // read @android:string/pill_nextDose_date
                txtNextDoseAndroidStringPillNextDoseDatePillNextDoseFormatted = txtNextDose.getResources().getString(R.string.pill_nextDose_date, pillNextDoseFormatted);
                // read @android:string/pill_Interval
                txtIntervalAndroidStringPillIntervalPillInterval = txtInterval.getResources().getString(R.string.pill_Interval, pillInterval);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnAlreadyTaken.setOnClickListener(mCallback7);
            this.btnSkip.setOnClickListener(mCallback6);
            this.btnTake.setOnClickListener(mCallback8);
            this.textViewOptions.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.mypillreminder.view.adapter.BindingAdapterKt.bindLoadListItemImage(this.imgPoster, pillPillImage);
            com.example.mypillreminder.view.adapter.BindingAdapterKt.displayImage(this.pillAlarm, pillHasReminder);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtInterval, txtIntervalAndroidStringPillIntervalPillInterval);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLastTaken, txtLastTakenAndroidStringPillLastTakenDatePillLastTakenFormatted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNextDose, txtNextDoseAndroidStringPillNextDoseDatePillNextDoseFormatted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, pillPillName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewHolder != null
                boolean viewHolderJavaLangObjectNull = false;
                // viewHolder
                com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder viewHolder = mViewHolder;
                // viewHolder.pillClickCallback
                com.example.mypillreminder.view.callback.PillClickCallback viewHolderPillClickCallback = null;
                // viewHolder.pillClickCallback != null
                boolean viewHolderPillClickCallbackJavaLangObjectNull = false;
                // pill
                com.example.mypillreminder.service.model.Pill pill = mPill;



                viewHolderJavaLangObjectNull = (viewHolder) != (null);
                if (viewHolderJavaLangObjectNull) {


                    viewHolderPillClickCallback = viewHolder.getPillClickCallback();

                    viewHolderPillClickCallbackJavaLangObjectNull = (viewHolderPillClickCallback) != (null);
                    if (viewHolderPillClickCallbackJavaLangObjectNull) {



                        viewHolderPillClickCallback.onTakeClick(pill);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewHolder != null
                boolean viewHolderJavaLangObjectNull = false;
                // viewHolder
                com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder viewHolder = mViewHolder;
                // viewHolder.pillClickCallback
                com.example.mypillreminder.view.callback.PillClickCallback viewHolderPillClickCallback = null;
                // viewHolder.pillClickCallback != null
                boolean viewHolderPillClickCallbackJavaLangObjectNull = false;
                // pill
                com.example.mypillreminder.service.model.Pill pill = mPill;



                viewHolderJavaLangObjectNull = (viewHolder) != (null);
                if (viewHolderJavaLangObjectNull) {


                    viewHolderPillClickCallback = viewHolder.getPillClickCallback();

                    viewHolderPillClickCallbackJavaLangObjectNull = (viewHolderPillClickCallback) != (null);
                    if (viewHolderPillClickCallbackJavaLangObjectNull) {



                        viewHolderPillClickCallback.onSkipClick(pill);
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewHolder != null
                boolean viewHolderJavaLangObjectNull = false;
                // viewHolder
                com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder viewHolder = mViewHolder;
                // viewHolder.pillClickCallback
                com.example.mypillreminder.view.callback.PillClickCallback viewHolderPillClickCallback = null;
                // viewHolder.pillClickCallback != null
                boolean viewHolderPillClickCallbackJavaLangObjectNull = false;
                // pill
                com.example.mypillreminder.service.model.Pill pill = mPill;



                viewHolderJavaLangObjectNull = (viewHolder) != (null);
                if (viewHolderJavaLangObjectNull) {


                    viewHolderPillClickCallback = viewHolder.getPillClickCallback();

                    viewHolderPillClickCallbackJavaLangObjectNull = (viewHolderPillClickCallback) != (null);
                    if (viewHolderPillClickCallbackJavaLangObjectNull) {



                        viewHolderPillClickCallback.onAlreadyTakenClick(pill);
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewHolder != null
                boolean viewHolderJavaLangObjectNull = false;
                // viewHolder
                com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder viewHolder = mViewHolder;
                // viewHolder.pillClickCallback
                com.example.mypillreminder.view.callback.PillClickCallback viewHolderPillClickCallback = null;
                // viewHolder.pillClickCallback != null
                boolean viewHolderPillClickCallbackJavaLangObjectNull = false;
                // pill
                com.example.mypillreminder.service.model.Pill pill = mPill;



                viewHolderJavaLangObjectNull = (viewHolder) != (null);
                if (viewHolderJavaLangObjectNull) {


                    viewHolderPillClickCallback = viewHolder.getPillClickCallback();

                    viewHolderPillClickCallbackJavaLangObjectNull = (viewHolderPillClickCallback) != (null);
                    if (viewHolderPillClickCallbackJavaLangObjectNull) {



                        viewHolderPillClickCallback.onEditClicked(pill);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pill
        flag 1 (0x2L): viewHolder
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}