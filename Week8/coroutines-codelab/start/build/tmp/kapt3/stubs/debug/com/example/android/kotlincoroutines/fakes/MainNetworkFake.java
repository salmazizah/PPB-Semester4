package com.example.android.kotlincoroutines.fakes;

import java.lang.System;

/**
 * Testing Fake implementation of MainNetwork
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\b\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/android/kotlincoroutines/fakes/MainNetworkFake;", "Lcom/example/android/kotlincoroutines/main/MainNetwork;", "result", "", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "setResult", "fetchNextTitle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start_debug"})
public final class MainNetworkFake implements com.example.android.kotlincoroutines.main.MainNetwork {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String result;
    
    public MainNetworkFake(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchNextTitle(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}