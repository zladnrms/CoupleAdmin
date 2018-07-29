package io.defy.www.coupleadmin.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/defy/www/coupleadmin/presenter/ContactsPresenter;", "Lio/defy/www/coupleadmin/contract/ContactsContract$Presenter;", "()V", "apiInterface", "Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "getApiInterface", "()Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "apiInterface$delegate", "Lkotlin/Lazy;", "repo", "Lcom/zeniex/www/zeniexautomarketing/model/ContactsDataRepositoryModel;", "view", "Lio/defy/www/coupleadmin/contract/ContactsContract$View;", "attachView", "", "", "detachView", "getCallLog", "context", "Landroid/content/Context;", "timeToString", "", "time", "", "app_debug"})
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String timeToString(long time) {
        return null;
    }
    
    public ContactsPresenter() {
        super();
    }
}