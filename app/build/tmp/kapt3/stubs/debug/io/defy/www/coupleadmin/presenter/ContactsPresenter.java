package io.defy.www.coupleadmin.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016Jd\u0010\u0014\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0017\"\u0004\b\u0003\u0010\u00182\b\u0010\u0019\u001a\u0004\u0018\u0001H\u00152\b\u0010\u001a\u001a\u0004\u0018\u0001H\u00162\b\u0010\u001b\u001a\u0004\u0018\u0001H\u00172\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u00180\u001dH\u0086\b\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lio/defy/www/coupleadmin/presenter/ContactsPresenter;", "Lio/defy/www/coupleadmin/contract/ContactsContract$Presenter;", "()V", "apiInterface", "Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "getApiInterface", "()Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "apiInterface$delegate", "Lkotlin/Lazy;", "repo", "Lcom/zeniex/www/zeniexautomarketing/model/ContactsDataRepositoryModel;", "view", "Lio/defy/www/coupleadmin/contract/ContactsContract$View;", "attachView", "", "", "detachView", "getCallLog", "context", "Landroid/content/Context;", "ifNotNull", "A", "B", "C", "R", "a", "b", "c", "code", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "stringToDate", "Ljava/util/Date;", "date", "", "timeToString", "time", "", "app_debug"})
public final class ContactsPresenter implements io.defy.www.coupleadmin.contract.ContactsContract.Presenter {
    private io.defy.www.coupleadmin.contract.ContactsContract.View view;
    private com.zeniex.www.zeniexautomarketing.model.ContactsDataRepositoryModel repo;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy apiInterface$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zeniex.www.zeniexautomarketing.network.ApiInterface getApiInterface() {
        return null;
    }
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    java.lang.Object view) {
    }
    
    @java.lang.Override()
    public void detachView(@org.jetbrains.annotations.NotNull()
    java.lang.Object view) {
    }
    
    @java.lang.Override()
    public void getCallLog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, R extends java.lang.Object>void ifNotNull(@org.jetbrains.annotations.Nullable()
    A a, @org.jetbrains.annotations.Nullable()
    B b, @org.jetbrains.annotations.Nullable()
    C c, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, ? extends R> code) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String timeToString(long time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Date stringToDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    public ContactsPresenter() {
        super();
    }
}