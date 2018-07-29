package com.zeniex.www.zeniexautomarketing.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&JG\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lcom/zeniex/www/zeniexautomarketing/model/ContactsDataRepositoryModel;", "", "delete", "", "insert", "id", "", "phone_number", "", "display_name", "email", "date", "Ljava/util/Date;", "photo_id", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "realmClose", "select", "Lio/defy/www/coupleadmin/model/data/ContactsData;", "app_debug"})
public abstract interface ContactsDataRepositoryModel {
    
    public abstract void insert(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, @org.jetbrains.annotations.Nullable()
    java.lang.String display_name, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.Nullable()
    java.lang.String photo_id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.defy.www.coupleadmin.model.data.ContactsData select();
    
    public abstract void delete();
    
    public abstract void realmClose();
}