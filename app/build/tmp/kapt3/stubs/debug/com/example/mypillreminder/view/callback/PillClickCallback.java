package com.example.mypillreminder.view.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/example/mypillreminder/view/callback/PillClickCallback;", "", "onAlreadyTakenClick", "", "pill", "Lcom/example/mypillreminder/service/model/Pill;", "onDeleteClicked", "onEditClicked", "onSkipClick", "onTakeClick", "app_debug"})
public abstract interface PillClickCallback {
    
    public abstract void onTakeClick(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
    
    public abstract void onAlreadyTakenClick(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
    
    public abstract void onSkipClick(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
    
    public abstract void onEditClicked(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
    
    public abstract void onDeleteClicked(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
}