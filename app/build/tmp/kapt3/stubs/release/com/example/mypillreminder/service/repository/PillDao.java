package com.example.mypillreminder.service.repository;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\nH\'J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/mypillreminder/service/repository/PillDao;", "", "delete", "", "pill", "Lcom/example/mypillreminder/service/model/Pill;", "deleteAllPills", "getLatestPill", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPillById", "Landroidx/lifecycle/LiveData;", "pillID", "", "getPillByIdentifier", "pillIdentifier", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPills", "", "getPillsList", "insert", "update", "app_release"})
public abstract interface PillDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.mypillreminder.service.model.Pill pill);
    
    @androidx.room.Query(value = "Delete from tblPills")
    public abstract void deleteAllPills();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tblPills ORDER BY _id Desc")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.mypillreminder.service.model.Pill>> getPills();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM tblPills ORDER BY _id Desc")
    public abstract java.util.List<com.example.mypillreminder.service.model.Pill> getPillsList();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tblPills WHERE _id=:pillID")
    public abstract androidx.lifecycle.LiveData<com.example.mypillreminder.service.model.Pill> getPillById(int pillID);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM tblPills WHERE pillIdentifier = :pillIdentifier")
    public abstract java.lang.Object getPillByIdentifier(@org.jetbrains.annotations.NotNull()
    java.lang.String pillIdentifier, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mypillreminder.service.model.Pill> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM tblPills ORDER BY _id DESC LIMIT 1")
    public abstract java.lang.Object getLatestPill(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mypillreminder.service.model.Pill> p0);
}