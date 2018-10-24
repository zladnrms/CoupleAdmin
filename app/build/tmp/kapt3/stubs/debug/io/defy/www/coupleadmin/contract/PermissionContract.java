package io.defy.www.coupleadmin.contract;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lio/defy/www/coupleadmin/contract/PermissionContract;", "", "Presenter", "View", "app_debug"})
public abstract interface PermissionContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/defy/www/coupleadmin/contract/PermissionContract$View;", "", "app_debug"})
    public static abstract interface View {
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&\u00a8\u0006\u0006"}, d2 = {"Lio/defy/www/coupleadmin/contract/PermissionContract$Presenter;", "", "attachView", "", "view", "detachView", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void attachView(@org.jetbrains.annotations.NotNull()
        java.lang.Object view);
        
        public abstract void detachView(@org.jetbrains.annotations.NotNull()
        java.lang.Object view);
    }
}