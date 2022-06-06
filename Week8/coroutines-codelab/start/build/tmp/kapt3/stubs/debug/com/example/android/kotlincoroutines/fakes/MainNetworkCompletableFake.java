package com.example.android.kotlincoroutines.fakes;

import java.lang.System;

/**
 * Testing Fake for MainNetwork that lets you complete or error all current requests
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0006\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/android/kotlincoroutines/fakes/MainNetworkCompletableFake;", "Lcom/example/android/kotlincoroutines/main/MainNetwork;", "()V", "completable", "Lkotlinx/coroutines/CompletableDeferred;", "", "fetchNextTitle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCompletionToAllCurrentRequests", "", "result", "sendErrorToCurrentRequests", "throwable", "", "start_debug"})
public final class MainNetworkCompletableFake implements com.example.android.kotlincoroutines.main.MainNetwork {
    private kotlinx.coroutines.CompletableDeferred<java.lang.String> completable;
    
    public MainNetworkCompletableFake() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchNextTitle(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    public final void sendCompletionToAllCurrentRequests(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
    }
    
    public final void sendErrorToCurrentRequests(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
}