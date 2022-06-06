package com.example.android.kotlincoroutines.main;

import java.lang.System;

/**
 * MainViewModel designed to store and manage UI-related data in a lifecycle conscious way. This
 * allows data to survive configuration changes such as screen rotations. In addition, background
 * work such as fetching network results can continue through configuration changes and deliver
 * results after the new Fragment or Activity is available.
 *
 * @param repository the data source this ViewModel will fetch results from.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001aH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/android/kotlincoroutines/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/android/kotlincoroutines/main/TitleRepository;", "(Lcom/example/android/kotlincoroutines/main/TitleRepository;)V", "_snackBar", "Landroidx/lifecycle/MutableLiveData;", "", "_spinner", "", "_taps", "snackbar", "Landroidx/lifecycle/LiveData;", "getSnackbar", "()Landroidx/lifecycle/LiveData;", "spinner", "getSpinner", "tapCount", "", "taps", "getTaps", "title", "getTitle", "launchDataLoad", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "onMainViewClicked", "onSnackbarShown", "refreshTitle", "updateTaps", "Companion", "start_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.android.kotlincoroutines.main.TitleRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.kotlincoroutines.main.MainViewModel.Companion Companion = null;
    
    /**
     * Factory for creating [MainViewModel]
     *
     * @param arg the repository to pass to [MainViewModel]
     */
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function1<com.example.android.kotlincoroutines.main.TitleRepository, androidx.lifecycle.ViewModelProvider.NewInstanceFactory> FACTORY = null;
    
    /**
     * Request a snackbar to display a string.
     *
     * This variable is private because we don't want to expose MutableLiveData
     *
     * MutableLiveData allows anyone to set a value, and MainViewModel is the only
     * class that should be setting values.
     */
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _snackBar = null;
    
    /**
     * Update title text via this LiveData
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> title = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _spinner = null;
    
    /**
     * Count of taps on the screen
     */
    private int tapCount = 0;
    
    /**
     * LiveData with formatted tap count.
     */
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _taps = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.kotlincoroutines.main.TitleRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSnackbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSpinner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTaps() {
        return null;
    }
    
    /**
     * Respond to onClick events by refreshing the title.
     *
     * The loading spinner will display until a result is returned, and errors will trigger
     * a snackbar.
     */
    public final void onMainViewClicked() {
    }
    
    /**
     * Wait one second then update the tap count.
     */
    public final void updateTaps() {
    }
    
    /**
     * Called immediately after the UI shows the snackbar.
     */
    public final void onSnackbarShown() {
    }
    
    /**
     * Refresh the title, showing a loading spinner while it refreshes and errors via snackbar.
     */
    public final void refreshTitle() {
    }
    
    private final kotlinx.coroutines.Job launchDataLoad(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/android/kotlincoroutines/main/MainViewModel$Companion;", "", "()V", "FACTORY", "Lkotlin/Function1;", "Lcom/example/android/kotlincoroutines/main/TitleRepository;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getFACTORY", "()Lkotlin/jvm/functions/Function1;", "start_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.example.android.kotlincoroutines.main.TitleRepository, androidx.lifecycle.ViewModelProvider.NewInstanceFactory> getFACTORY() {
            return null;
        }
    }
}