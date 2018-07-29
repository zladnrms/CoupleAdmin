package com.zeniex.www.zeniexautomarketing.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\'J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\'J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\'J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\'\u00a8\u0006\n"}, d2 = {"Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "", "autologin", "Lretrofit2/Call;", "", "cookie", "balanaceData", "logout", "userUIDData", "Companion", "app_debug"})
public abstract interface ApiInterface {
    public static final com.zeniex.www.zeniexautomarketing.network.ApiInterface.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "")
    public abstract retrofit2.Call<java.lang.String> autologin(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Cookie")
    java.lang.String cookie);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "login_out.html")
    public abstract retrofit2.Call<java.lang.String> logout(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Cookie")
    java.lang.String cookie);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "account_balance.html")
    public abstract retrofit2.Call<java.lang.String> balanaceData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Cookie")
    java.lang.String cookie);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "user_center_info.html")
    public abstract retrofit2.Call<java.lang.String> userUIDData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Cookie")
    java.lang.String cookie);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface$Companion;", "", "()V", "create", "Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.zeniex.www.zeniexautomarketing.network.ApiInterface create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}