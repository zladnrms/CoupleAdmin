package io.defy.www.coupleadmin.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/defy/www/coupleadmin/view/ContactsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lio/defy/www/coupleadmin/contract/ContactsContract$View;", "()V", "adapter", "Lio/defy/www/coupleadmin/adapter/view/ContactsListAdapter;", "editor", "Landroid/content/SharedPreferences$Editor;", "pref", "Landroid/content/SharedPreferences;", "presenter", "Lio/defy/www/coupleadmin/presenter/ContactsPresenter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "app_debug"})
public final class ContactsActivity extends android.support.v7.app.AppCompatActivity implements io.defy.www.coupleadmin.contract.ContactsContract.View {
    private io.defy.www.coupleadmin.presenter.ContactsPresenter presenter;
    private io.defy.www.coupleadmin.adapter.view.ContactsListAdapter adapter;
    private android.content.SharedPreferences pref;
    private android.content.SharedPreferences.Editor editor;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public ContactsActivity() {
        super();
    }
}