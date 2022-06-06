package com.example.android.kotlincoroutines.fakes;

import java.lang.System;

/**
 * Fake [TitleDao] for use in tests.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/android/kotlincoroutines/fakes/TitleDaoFake;", "Lcom/example/android/kotlincoroutines/main/TitleDao;", "initialTitle", "", "(Ljava/lang/String;)V", "_titleLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/kotlincoroutines/main/Title;", "insertedForNext", "Lkotlinx/coroutines/channels/Channel;", "titleLiveData", "Landroidx/lifecycle/LiveData;", "getTitleLiveData", "()Landroidx/lifecycle/LiveData;", "insertTitle", "", "title", "(Lcom/example/android/kotlincoroutines/main/Title;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextInsertedOrNull", "timeout", "", "start_debug"})
public final class TitleDaoFake implements com.example.android.kotlincoroutines.main.TitleDao {
    
    /**
     * A channel is a Coroutines based implementation of a blocking queue.
     *
     * We're using it here as a buffer of inserted elements.
     *
     * This uses a channel instead of a list to allow multiple threads to call insertTitle and
     * synchronize the results with the test thread.
     */
    private final kotlinx.coroutines.channels.Channel<com.example.android.kotlincoroutines.main.Title> insertedForNext = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.kotlincoroutines.main.Title> _titleLiveData = null;
    
    public TitleDaoFake(@org.jetbrains.annotations.NotNull()
    java.lang.String initialTitle) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertTitle(@org.jetbrains.annotations.NotNull()
    com.example.android.kotlincoroutines.main.Title title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.example.android.kotlincoroutines.main.Title> getTitleLiveData() {
        return null;
    }
    
    /**
     * Assertion that the next element inserted has a title of expected
     *
     * If the element was previously inserted and is currently the most recent element
     * this assertion will also match. This allows tests to avoid synchronizing calls to insert
     * with calls to assertNextInsert.
     *
     * If multiple items were inserted, this will always match the first item that was not
     * previously matched.
     *
     * @param expected the value to match
     * @param timeout duration to wait (this is provided for instrumentation tests that may run on
     *               multiple threads)
     * @param unit timeunit
     * @return the next value that was inserted into this dao, or null if none found
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String nextInsertedOrNull(long timeout) {
        return null;
    }
}