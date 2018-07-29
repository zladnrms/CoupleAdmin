package io.defy.www.coupleadmin.adapter.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lio/defy/www/coupleadmin/adapter/model/ContactsDataModel;", "", "add", "", "data", "Lio/defy/www/coupleadmin/model/data/ContactsData;", "clear", "remove", "position", "", "app_debug"})
public abstract interface ContactsDataModel {
    
    public abstract void add(@org.jetbrains.annotations.NotNull()
    io.defy.www.coupleadmin.model.data.ContactsData data);
    
    public abstract void remove(int position);
    
    public abstract void clear();
}