package com.example.mypillreminder.features.addeditpill;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\"\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J \u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0019H\u0016J\b\u00102\u001a\u00020\u0019H\u0002J\u0006\u00103\u001a\u00020\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00064"}, d2 = {"Lcom/example/mypillreminder/features/addeditpill/AddEditPillFragment;", "Landroidx/fragment/app/Fragment;", "Lme/himanshusoni/quantityview/QuantityView$OnQuantityChangeListener;", "()V", "REQUEST_IMAGE", "", "getREQUEST_IMAGE", "()I", "args", "Lcom/example/mypillreminder/features/addeditpill/AddEditPillFragmentArgs;", "getArgs", "()Lcom/example/mypillreminder/features/addeditpill/AddEditPillFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/mypillreminder/databinding/FragmentAddEditPillBinding;", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/example/mypillreminder/features/addeditpill/AddEditPillViewModel;", "getViewModel", "()Lcom/example/mypillreminder/features/addeditpill/AddEditPillViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "dateTimeSet", "", "pickedDateTime", "Ljava/util/Calendar;", "observeViewModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLimitReached", "onQuantityChanged", "oldQuantity", "newQuantity", "programmatically", "", "onResume", "pickDateTime", "selectProfilePicture", "app_debug"})
public final class AddEditPillFragment extends androidx.fragment.app.Fragment implements me.himanshusoni.quantityview.QuantityView.OnQuantityChangeListener {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.example.mypillreminder.databinding.FragmentAddEditPillBinding binding;
    private androidx.navigation.NavController navController;
    private final kotlin.Lazy viewModel$delegate = null;
    private final int REQUEST_IMAGE = 100;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.mypillreminder.features.addeditpill.AddEditPillFragmentArgs getArgs() {
        return null;
    }
    
    private final com.example.mypillreminder.features.addeditpill.AddEditPillViewModel getViewModel() {
        return null;
    }
    
    public final int getREQUEST_IMAGE() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeViewModel() {
    }
    
    private final void pickDateTime() {
    }
    
    public final void dateTimeSet(@org.jetbrains.annotations.NotNull()
    java.util.Calendar pickedDateTime) {
    }
    
    @java.lang.Override()
    public void onQuantityChanged(int oldQuantity, int newQuantity, boolean programmatically) {
    }
    
    @java.lang.Override()
    public void onLimitReached() {
    }
    
    public final void selectProfilePicture() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public AddEditPillFragment() {
        super();
    }
}