package com.example.mypillreminder.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mypillreminder/view/adapter/PillAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/mypillreminder/service/model/Pill;", "Lcom/example/mypillreminder/view/adapter/PillAdapter$PillViewHolder;", "pillClickCallback", "Lcom/example/mypillreminder/view/callback/PillClickCallback;", "(Lcom/example/mypillreminder/view/callback/PillClickCallback;)V", "getItemPillAt", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PillViewHolder", "app_debug"})
public final class PillAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.mypillreminder.service.model.Pill, com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder> {
    private final com.example.mypillreminder.view.callback.PillClickCallback pillClickCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mypillreminder.service.model.Pill getItemPillAt(int position) {
        return null;
    }
    
    public PillAdapter(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.view.callback.PillClickCallback pillClickCallback) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/example/mypillreminder/view/adapter/PillAdapter$PillViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/mypillreminder/databinding/PillListItemBinding;", "pillClickCallback", "Lcom/example/mypillreminder/view/callback/PillClickCallback;", "(Lcom/example/mypillreminder/databinding/PillListItemBinding;Lcom/example/mypillreminder/view/callback/PillClickCallback;)V", "getBinding", "()Lcom/example/mypillreminder/databinding/PillListItemBinding;", "getPillClickCallback", "()Lcom/example/mypillreminder/view/callback/PillClickCallback;", "bind", "", "pill", "Lcom/example/mypillreminder/service/model/Pill;", "Companion", "app_debug"})
    public static final class PillViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.mypillreminder.databinding.PillListItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final com.example.mypillreminder.view.callback.PillClickCallback pillClickCallback = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.mypillreminder.service.model.Pill pill) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mypillreminder.databinding.PillListItemBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mypillreminder.view.callback.PillClickCallback getPillClickCallback() {
            return null;
        }
        
        private PillViewHolder(com.example.mypillreminder.databinding.PillListItemBinding binding, com.example.mypillreminder.view.callback.PillClickCallback pillClickCallback) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/mypillreminder/view/adapter/PillAdapter$PillViewHolder$Companion;", "", "()V", "getInstance", "Lcom/example/mypillreminder/view/adapter/PillAdapter$PillViewHolder;", "parent", "Landroid/view/ViewGroup;", "pillClickCallback", "Lcom/example/mypillreminder/view/callback/PillClickCallback;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.mypillreminder.view.adapter.PillAdapter.PillViewHolder getInstance(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            com.example.mypillreminder.view.callback.PillClickCallback pillClickCallback) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}