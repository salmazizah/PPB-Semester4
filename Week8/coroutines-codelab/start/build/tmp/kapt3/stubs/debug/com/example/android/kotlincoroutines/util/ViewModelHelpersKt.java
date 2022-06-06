package com.example.android.kotlincoroutines.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0001\u00a8\u0006\u0007"}, d2 = {"singleArgViewModelFactory", "Lkotlin/Function1;", "A", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "T", "Landroidx/lifecycle/ViewModel;", "constructor", "start_debug"})
public final class ViewModelHelpersKt {
    
    /**
     * Convenience factory to handle ViewModels with one parameter.
     *
     * Make a factory:
     * ```
     * // Make a factory
     * val FACTORY = viewModelFactory(::MyViewModel)
     * ```
     *
     * Use the generated factory:
     * ```
     * ViewModelProviders.of(this, FACTORY(argument))
     *
     * ```
     *
     * @param constructor A function (A) -> T that returns an instance of the ViewModel (typically pass
     * the constructor)
     * @return a function of one argument that returns ViewModelProvider.Factory for ViewModelProviders
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends androidx.lifecycle.ViewModel, A extends java.lang.Object>kotlin.jvm.functions.Function1<A, androidx.lifecycle.ViewModelProvider.NewInstanceFactory> singleArgViewModelFactory(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends T> constructor) {
        return null;
    }
}