package io.defy.www.coupleadmin.contract;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lio/defy/www/coupleadmin/contract/ContactsContract;", "", "Presenter", "View", "app_debug"})
public abstract interface ContactsContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/defy/www/coupleadmin/contract/ContactsContract$View;", "", "add", "", "data", "Lio/defy/www/coupleadmin/model/data/ContactsData;", "app_debug"})
    public static abstract interface View {
        
        public abstract void add(@org.jetbrains.annotations.NotNull()
        io.defy.www.coupleadmin.model.data.ContactsData data);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lio/defy/www/coupleadmin/contract/ContactsContract$Presenter;", "", "attachView", "", "view", "detachView", "getCallLog", "context", "Landroid/content/Context;", "stringToDate", "Ljava/util/Date;", "date", "", "timeToString", "time", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void attachView(@org.jetbrains.annotations.NotNull()
        java.lang.Object view);
        
        public abstract void detachView(@org.jetbrains.annotations.NotNull()
        java.lang.Object view);
        
        public abstract void getCallLog(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String timeToString(long time);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.Date stringToDate(@org.jetbrains.annotations.NotNull()
        java.lang.String date);
    }
}