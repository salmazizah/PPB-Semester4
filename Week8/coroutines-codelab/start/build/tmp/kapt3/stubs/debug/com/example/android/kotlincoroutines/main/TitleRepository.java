package com.example.android.kotlincoroutines.main;

import java.lang.System;

/**
 * TitleRepository provides an interface to fetch a title or request a new one be generated.
 *
 * Repository modules handle data operations. They provide a clean API so that the rest of the app
 * can retrieve this data easily. They know where to get the data from and what API calls to make
 * when data is updated. You can consider repositories to be mediators between different data
 * sources, in our case it mediates between a network API and an offline database cache.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/android/kotlincoroutines/main/TitleRepository;", "", "network", "Lcom/example/android/kotlincoroutines/main/MainNetwork;", "titleDao", "Lcom/example/android/kotlincoroutines/main/TitleDao;", "(Lcom/example/android/kotlincoroutines/main/MainNetwork;Lcom/example/android/kotlincoroutines/main/TitleDao;)V", "getNetwork", "()Lcom/example/android/kotlincoroutines/main/MainNetwork;", "title", "Landroidx/lifecycle/LiveData;", "", "getTitle", "()Landroidx/lifecycle/LiveData;", "getTitleDao", "()Lcom/example/android/kotlincoroutines/main/TitleDao;", "refreshTitle", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start_debug"})
public final class TitleRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.kotlincoroutines.main.MainNetwork network = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.kotlincoroutines.main.TitleDao titleDao = null;
    
    /**
     * [LiveData] to load title.
     *
     * This is the main interface for loading a title. The title will be loaded from the offline
     * cache.
     *
     * Observing this will not cause the title to be refreshed, use [TitleRepository.refreshTitleWithCallbacks]
     * to refresh the title.
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> title = null;
    
    public TitleRepository(@org.jetbrains.annotations.NotNull()
    com.example.android.kotlincoroutines.main.MainNetwork network, @org.jetbrains.annotations.NotNull()
    com.example.android.kotlincoroutines.main.TitleDao titleDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.kotlincoroutines.main.MainNetwork getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.kotlincoroutines.main.TitleDao getTitleDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshTitle(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}