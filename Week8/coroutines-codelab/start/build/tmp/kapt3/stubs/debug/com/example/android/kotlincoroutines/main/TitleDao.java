package com.example.android.kotlincoroutines.main;

import java.lang.System;

/**
 * *
 * Very small database that will hold one title
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/kotlincoroutines/main/TitleDao;", "", "titleLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/android/kotlincoroutines/main/Title;", "getTitleLiveData", "()Landroidx/lifecycle/LiveData;", "insertTitle", "", "title", "(Lcom/example/android/kotlincoroutines/main/Title;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start_debug"})
public abstract interface TitleDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTitle(@org.jetbrains.annotations.NotNull()
    com.example.android.kotlincoroutines.main.Title title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Title where id = 0")
    public abstract androidx.lifecycle.LiveData<com.example.android.kotlincoroutines.main.Title> getTitleLiveData();
}