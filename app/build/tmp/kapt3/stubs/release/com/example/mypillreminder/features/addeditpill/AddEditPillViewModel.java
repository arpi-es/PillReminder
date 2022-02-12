package com.example.mypillreminder.features.addeditpill;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000 B2\u00020\u0001:\u0001BB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020/H\u0002J\u0006\u00101\u001a\u00020/J\u0006\u00102\u001a\u00020/J\u0006\u00103\u001a\u00020/J\u0006\u00104\u001a\u00020/J\u0006\u00105\u001a\u00020/J\u0006\u00106\u001a\u00020/J\u0006\u00107\u001a\u00020/J\u0006\u00108\u001a\u00020/J\u0006\u00109\u001a\u00020/J\u0006\u0010:\u001a\u00020/J\u000e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020\u0005J\u000e\u0010=\u001a\u00020/2\u0006\u0010$\u001a\u00020\fJ\u000e\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020\u0012J\u0006\u0010@\u001a\u00020/J\u0006\u0010A\u001a\u00020/R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0!8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010#R\u0019\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010#R\u0019\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010#R\u0019\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010#R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120!8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010#\u00a8\u0006C"}, d2 = {"Lcom/example/mypillreminder/features/addeditpill/AddEditPillViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/example/mypillreminder/service/repository/PillRepository;", "pillIdentifier", "", "app", "Landroid/app/Application;", "(Lcom/example/mypillreminder/service/repository/PillRepository;Ljava/lang/String;Landroid/app/Application;)V", "_imagePath", "Landroidx/lifecycle/MutableLiveData;", "_interval", "", "_navigateToHome", "", "_openChooseDate", "_openChooseImage", "_startDate", "", "_startDateFormatted", "get_startDateFormatted", "()Landroidx/lifecycle/MutableLiveData;", "_switchReminder", "get_switchReminder", "_titleEditText", "get_titleEditText", "alarmManager", "Landroid/app/AlarmManager;", "getApp", "()Landroid/app/Application;", "editablepill", "Lcom/example/mypillreminder/service/model/Pill;", "imagePath", "Landroidx/lifecycle/LiveData;", "getImagePath", "()Landroidx/lifecycle/LiveData;", "interval", "getInterval", "navigateToHome", "getNavigateToHome", "openChooseDate", "getOpenChooseDate", "openChooseImage", "getOpenChooseImage", "startDate", "getStartDate", "cancelExistingAlarm", "", "checkBeforeInsert", "createReminderAlarm", "doneChooseDate", "doneChooseImage", "doneNavigating", "initializeReminder", "onCancelClicked", "onChooseDateClicked", "onImageDeleteClicked", "onSaveClicked", "onSelectImageClicked", "setImagePath", "picturePath", "setInterval", "setStartDate", "startDateTime", "updateReminder", "updateUI", "Companion", "app_release"})
public final class AddEditPillViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.mypillreminder.service.model.Pill editablepill;
    private final android.app.AlarmManager alarmManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _titleEditText = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _startDate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _startDateFormatted = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _interval = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _switchReminder = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _imagePath = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _navigateToHome = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _openChooseDate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _openChooseImage = null;
    private final com.example.mypillreminder.service.repository.PillRepository repository = null;
    private final java.lang.String pillIdentifier = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    private static final java.lang.String TAG = "AddEditPillViewModel";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mypillreminder.features.addeditpill.AddEditPillViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_titleEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_startDateFormatted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getInterval() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_switchReminder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getImagePath() {
        return null;
    }
    
    public final void initializeReminder() {
    }
    
    public final void updateUI() {
    }
    
    public final void onImageDeleteClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getNavigateToHome() {
        return null;
    }
    
    public final void onCancelClicked() {
    }
    
    public final void doneNavigating() {
    }
    
    public final void setInterval(int interval) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getOpenChooseDate() {
        return null;
    }
    
    public final void onChooseDateClicked() {
    }
    
    public final void doneChooseDate() {
    }
    
    public final void setStartDate(long startDateTime) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getOpenChooseImage() {
        return null;
    }
    
    public final void doneChooseImage() {
    }
    
    public final void onSelectImageClicked() {
    }
    
    public final void setImagePath(@org.jetbrains.annotations.NotNull()
    java.lang.String picturePath) {
    }
    
    public final void onSaveClicked() {
    }
    
    public final void updateReminder() {
    }
    
    private final void checkBeforeInsert() {
    }
    
    public final void cancelExistingAlarm() {
    }
    
    public final void createReminderAlarm() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public AddEditPillViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.repository.PillRepository repository, @org.jetbrains.annotations.Nullable()
    java.lang.String pillIdentifier, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mypillreminder/features/addeditpill/AddEditPillViewModel$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}