package com.example.mypillreminder.service.model;

import java.lang.System;

@androidx.room.Entity(tableName = "tblPills")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\fH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\fH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\fH\u00c6\u0003Jm\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u00c6\u0001J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\u0006\u00109\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\u0005J\t\u0010;\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010#\"\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010&R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014\u00a8\u0006<"}, d2 = {"Lcom/example/mypillreminder/service/model/Pill;", "", "id", "", "pillIdentifier", "", "pillName", "pillImage", "interval", "hasReminder", "", "startTime", "", "nextDose", "endTime", "lastTaken", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZJJJJ)V", "getEndTime", "()J", "setEndTime", "(J)V", "getHasReminder", "()Z", "setHasReminder", "(Z)V", "getId", "()I", "getInterval", "setInterval", "(I)V", "getLastTaken", "setLastTaken", "getNextDose", "setNextDose", "getPillIdentifier", "()Ljava/lang/String;", "getPillImage", "setPillImage", "(Ljava/lang/String;)V", "getPillName", "setPillName", "getStartTime", "setStartTime", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "lastTakenFormatted", "nextDoseFormatted", "toString", "app_debug"})
public final class Pill {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "_id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pillIdentifier = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pillName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pillImage;
    private int interval;
    private boolean hasReminder;
    private long startTime;
    private long nextDose;
    private long endTime;
    private long lastTaken;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String lastTakenFormatted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String nextDoseFormatted() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPillIdentifier() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPillName() {
        return null;
    }
    
    public final void setPillName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPillImage() {
        return null;
    }
    
    public final void setPillImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getInterval() {
        return 0;
    }
    
    public final void setInterval(int p0) {
    }
    
    public final boolean getHasReminder() {
        return false;
    }
    
    public final void setHasReminder(boolean p0) {
    }
    
    public final long getStartTime() {
        return 0L;
    }
    
    public final void setStartTime(long p0) {
    }
    
    public final long getNextDose() {
        return 0L;
    }
    
    public final void setNextDose(long p0) {
    }
    
    public final long getEndTime() {
        return 0L;
    }
    
    public final void setEndTime(long p0) {
    }
    
    public final long getLastTaken() {
        return 0L;
    }
    
    public final void setLastTaken(long p0) {
    }
    
    public Pill(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String pillIdentifier, @org.jetbrains.annotations.NotNull()
    java.lang.String pillName, @org.jetbrains.annotations.NotNull()
    java.lang.String pillImage, int interval, boolean hasReminder, long startTime, long nextDose, long endTime, long lastTaken) {
        super();
    }
    
    public Pill() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long component10() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mypillreminder.service.model.Pill copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String pillIdentifier, @org.jetbrains.annotations.NotNull()
    java.lang.String pillName, @org.jetbrains.annotations.NotNull()
    java.lang.String pillImage, int interval, boolean hasReminder, long startTime, long nextDose, long endTime, long lastTaken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}