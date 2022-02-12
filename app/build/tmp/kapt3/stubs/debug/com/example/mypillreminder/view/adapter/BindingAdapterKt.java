package com.example.mypillreminder.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007\u00a8\u0006\u0010"}, d2 = {"bindLoadListItemImage", "", "imageView", "Landroid/widget/ImageView;", "imagePath", "", "bindPillImage", "displayImage", "hasReminder", "", "(Landroid/widget/ImageView;Ljava/lang/Boolean;)V", "submitPillList", "Landroidx/recyclerview/widget/RecyclerView;", "pills", "", "Lcom/example/mypillreminder/service/model/Pill;", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"LoadListItemImage"})
    public static final void bindLoadListItemImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String imagePath) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"PillImage"})
    public static final void bindPillImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String imagePath) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"pillList"})
    public static final void submitPillList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$submitPillList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.mypillreminder.service.model.Pill> pills) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @androidx.databinding.BindingAdapter(value = {"displayHasReminder"})
    public static final void displayImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$displayImage, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean hasReminder) {
    }
}