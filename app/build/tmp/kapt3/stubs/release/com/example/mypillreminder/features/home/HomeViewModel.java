package com.example.mypillreminder.features.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 22\u00020\u0001:\u00012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020\u001dJ\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010+\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020$J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0002J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\t0\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/example/mypillreminder/features/home/HomeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/example/mypillreminder/service/repository/PillRepository;", "app", "Landroid/app/Application;", "(Lcom/example/mypillreminder/service/repository/PillRepository;Landroid/app/Application;)V", "_navigateToAddPill", "Landroidx/lifecycle/MutableLiveData;", "", "_openChooseDate", "_selectedPill", "Lcom/example/mypillreminder/service/model/Pill;", "alarmManager", "Landroid/app/AlarmManager;", "getApp", "()Landroid/app/Application;", "isEmpty", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/LiveData;", "navigateToAddPill", "getNavigateToAddPill", "openChooseDate", "getOpenChooseDate", "pills", "", "getPills", "cancelExistingAlarm", "", "pill", "createReminderAlarm", "deletePill", "doneChooseDate", "doneNavigating", "getDurationToNextDose", "", "interval", "", "onAddPill", "onAlreadyTakenClick", "onCardClick", "onDeleteClicked", "onItemSwiped", "onSkipClick", "onTakeClicked", "setLastTakenDate", "lastTakenDateTime", "updateAlarm", "updatePill", "Companion", "app_release"})
public final class HomeViewModel extends androidx.lifecycle.AndroidViewModel {
    private final android.app.AlarmManager alarmManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.mypillreminder.service.model.Pill>> pills = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToAddPill = null;
    private com.example.mypillreminder.service.model.Pill _selectedPill;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _openChooseDate = null;
    private final com.example.mypillreminder.service.repository.PillRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    private static final java.lang.String TAG = "HomeViewModel";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mypillreminder.features.home.HomeViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mypillreminder.service.model.Pill>> getPills() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isEmpty() {
        return null;
    }
    
    private final void updatePill(com.example.mypillreminder.service.model.Pill pill) {
    }
    
    private final void deletePill(com.example.mypillreminder.service.model.Pill pill) {
    }
    
    private final void updateAlarm(com.example.mypillreminder.service.model.Pill pill) {
    }
    
    private final void createReminderAlarm(com.example.mypillreminder.service.model.Pill pill) {
    }
    
    private final void cancelExistingAlarm(com.example.mypillreminder.service.model.Pill pill) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToAddPill() {
        return null;
    }
    
    public final void onAddPill() {
    }
    
    public final void doneNavigating() {
    }
    
    public final void onTakeClicked(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill) {
    }
    
    public final void onSkipClick(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill) {
    }
    
    private final long getDurationToNextDose(int interval) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getOpenChooseDate() {
        return null;
    }
    
    public final void onAlreadyTakenClick(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill) {
    }
    
    public final void doneChooseDate() {
    }
    
    public final void setLastTakenDate(long lastTakenDateTime) {
    }
    
    public final void onItemSwiped(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill) {
    }
    
    public final void onDeleteClicked(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill) {
    }
    
    public final void onCardClick(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.repository.PillRepository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mypillreminder/features/home/HomeViewModel$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}