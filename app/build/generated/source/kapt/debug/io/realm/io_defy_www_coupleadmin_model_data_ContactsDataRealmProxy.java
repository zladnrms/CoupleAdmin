package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy extends io.defy.www.coupleadmin.model.data.ContactsData
    implements RealmObjectProxy, io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface {

    static final class ContactsDataColumnInfo extends ColumnInfo {
        long _idIndex;
        long idIndex;
        long phone_numberIndex;
        long display_nameIndex;
        long emailIndex;
        long photo_idIndex;
        long dateIndex;

        ContactsDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ContactsData");
            this._idIndex = addColumnDetails("_id", "_id", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.phone_numberIndex = addColumnDetails("phone_number", "phone_number", objectSchemaInfo);
            this.display_nameIndex = addColumnDetails("display_name", "display_name", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.photo_idIndex = addColumnDetails("photo_id", "photo_id", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
        }

        ContactsDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactsDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactsDataColumnInfo src = (ContactsDataColumnInfo) rawSrc;
            final ContactsDataColumnInfo dst = (ContactsDataColumnInfo) rawDst;
            dst._idIndex = src._idIndex;
            dst.idIndex = src.idIndex;
            dst.phone_numberIndex = src.phone_numberIndex;
            dst.display_nameIndex = src.display_nameIndex;
            dst.emailIndex = src.emailIndex;
            dst.photo_idIndex = src.photo_idIndex;
            dst.dateIndex = src.dateIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ContactsDataColumnInfo columnInfo;
    private ProxyState<io.defy.www.coupleadmin.model.data.ContactsData> proxyState;

    io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactsDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.defy.www.coupleadmin.model.data.ContactsData>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo._idIndex);
    }

    @Override
    public void realmSet$_id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field '_id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phone_number() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phone_numberIndex);
    }

    @Override
    public void realmSet$phone_number(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'phone_number' to null.");
            }
            row.getTable().setString(columnInfo.phone_numberIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone_number' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.phone_numberIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$display_name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.display_nameIndex);
    }

    @Override
    public void realmSet$display_name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.display_nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.display_nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.display_nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.display_nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photo_idIndex);
    }

    @Override
    public void realmSet$photo_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photo_idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photo_idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photo_idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photo_idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            }
            row.getTable().setDate(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
        }
        proxyState.getRow$realm().setDate(columnInfo.dateIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ContactsData", 7, 0);
        builder.addPersistedProperty("_id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("phone_number", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("display_name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photo_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactsDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ContactsDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ContactsData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ContactsData";
    }

    @SuppressWarnings("cast")
    public static io.defy.www.coupleadmin.model.data.ContactsData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.defy.www.coupleadmin.model.data.ContactsData obj = null;
        if (update) {
            Table table = realm.getTable(io.defy.www.coupleadmin.model.data.ContactsData.class);
            ContactsDataColumnInfo columnInfo = (ContactsDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class);
            long pkColumnIndex = columnInfo._idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("_id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("_id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("_id")) {
                if (json.isNull("_id")) {
                    obj = (io.realm.io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy) realm.createObjectInternal(io.defy.www.coupleadmin.model.data.ContactsData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy) realm.createObjectInternal(io.defy.www.coupleadmin.model.data.ContactsData.class, json.getInt("_id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field '_id'.");
            }
        }

        final io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface objProxy = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("phone_number")) {
            if (json.isNull("phone_number")) {
                objProxy.realmSet$phone_number(null);
            } else {
                objProxy.realmSet$phone_number((String) json.getString("phone_number"));
            }
        }
        if (json.has("display_name")) {
            if (json.isNull("display_name")) {
                objProxy.realmSet$display_name(null);
            } else {
                objProxy.realmSet$display_name((String) json.getString("display_name"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("photo_id")) {
            if (json.isNull("photo_id")) {
                objProxy.realmSet$photo_id(null);
            } else {
                objProxy.realmSet$photo_id((String) json.getString("photo_id"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                Object timestamp = json.get("date");
                if (timestamp instanceof String) {
                    objProxy.realmSet$date(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$date(new Date(json.getLong("date")));
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.defy.www.coupleadmin.model.data.ContactsData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.defy.www.coupleadmin.model.data.ContactsData obj = new io.defy.www.coupleadmin.model.data.ContactsData();
        final io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface objProxy = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$_id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field '_id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (name.equals("phone_number")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phone_number((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phone_number(null);
                }
            } else if (name.equals("display_name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$display_name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$display_name(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("photo_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photo_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photo_id(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$date(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$date(JsonUtils.stringToDate(reader.nextString()));
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field '_id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static io.defy.www.coupleadmin.model.data.ContactsData copyOrUpdate(Realm realm, io.defy.www.coupleadmin.model.data.ContactsData object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (io.defy.www.coupleadmin.model.data.ContactsData) cachedRealmObject;
        }

        io.defy.www.coupleadmin.model.data.ContactsData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.defy.www.coupleadmin.model.data.ContactsData.class);
            ContactsDataColumnInfo columnInfo = (ContactsDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class);
            long pkColumnIndex = columnInfo._idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static io.defy.www.coupleadmin.model.data.ContactsData copy(Realm realm, io.defy.www.coupleadmin.model.data.ContactsData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.defy.www.coupleadmin.model.data.ContactsData) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        io.defy.www.coupleadmin.model.data.ContactsData realmObject = realm.createObjectInternal(io.defy.www.coupleadmin.model.data.ContactsData.class, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) newObject).realmGet$_id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface realmObjectSource = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) newObject;
        io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface realmObjectCopy = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$phone_number(realmObjectSource.realmGet$phone_number());
        realmObjectCopy.realmSet$display_name(realmObjectSource.realmGet$display_name());
        realmObjectCopy.realmSet$email(realmObjectSource.realmGet$email());
        realmObjectCopy.realmSet$photo_id(realmObjectSource.realmGet$photo_id());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        return realmObject;
    }

    public static long insert(Realm realm, io.defy.www.coupleadmin.model.data.ContactsData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long tableNativePtr = table.getNativePtr();
        ContactsDataColumnInfo columnInfo = (ContactsDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long pkColumnIndex = columnInfo._idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$id(), false);
        String realmGet$phone_number = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$phone_number();
        if (realmGet$phone_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phone_numberIndex, rowIndex, realmGet$phone_number, false);
        }
        String realmGet$display_name = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$display_name();
        if (realmGet$display_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.display_nameIndex, rowIndex, realmGet$display_name, false);
        }
        String realmGet$email = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$photo_id = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$photo_id();
        if (realmGet$photo_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo_idIndex, rowIndex, realmGet$photo_id, false);
        }
        java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long tableNativePtr = table.getNativePtr();
        ContactsDataColumnInfo columnInfo = (ContactsDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long pkColumnIndex = columnInfo._idIndex;
        io.defy.www.coupleadmin.model.data.ContactsData object = null;
        while (objects.hasNext()) {
            object = (io.defy.www.coupleadmin.model.data.ContactsData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$id(), false);
            String realmGet$phone_number = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$phone_number();
            if (realmGet$phone_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phone_numberIndex, rowIndex, realmGet$phone_number, false);
            }
            String realmGet$display_name = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$display_name();
            if (realmGet$display_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.display_nameIndex, rowIndex, realmGet$display_name, false);
            }
            String realmGet$email = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$photo_id = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$photo_id();
            if (realmGet$photo_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo_idIndex, rowIndex, realmGet$photo_id, false);
            }
            java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, io.defy.www.coupleadmin.model.data.ContactsData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long tableNativePtr = table.getNativePtr();
        ContactsDataColumnInfo columnInfo = (ContactsDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long pkColumnIndex = columnInfo._idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$id(), false);
        String realmGet$phone_number = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$phone_number();
        if (realmGet$phone_number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phone_numberIndex, rowIndex, realmGet$phone_number, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phone_numberIndex, rowIndex, false);
        }
        String realmGet$display_name = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$display_name();
        if (realmGet$display_name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.display_nameIndex, rowIndex, realmGet$display_name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.display_nameIndex, rowIndex, false);
        }
        String realmGet$email = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$photo_id = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$photo_id();
        if (realmGet$photo_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photo_idIndex, rowIndex, realmGet$photo_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photo_idIndex, rowIndex, false);
        }
        java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long tableNativePtr = table.getNativePtr();
        ContactsDataColumnInfo columnInfo = (ContactsDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.ContactsData.class);
        long pkColumnIndex = columnInfo._idIndex;
        io.defy.www.coupleadmin.model.data.ContactsData object = null;
        while (objects.hasNext()) {
            object = (io.defy.www.coupleadmin.model.data.ContactsData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$_id());
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$id(), false);
            String realmGet$phone_number = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$phone_number();
            if (realmGet$phone_number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phone_numberIndex, rowIndex, realmGet$phone_number, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phone_numberIndex, rowIndex, false);
            }
            String realmGet$display_name = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$display_name();
            if (realmGet$display_name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.display_nameIndex, rowIndex, realmGet$display_name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.display_nameIndex, rowIndex, false);
            }
            String realmGet$email = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$photo_id = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$photo_id();
            if (realmGet$photo_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photo_idIndex, rowIndex, realmGet$photo_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photo_idIndex, rowIndex, false);
            }
            java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
            }
        }
    }

    public static io.defy.www.coupleadmin.model.data.ContactsData createDetachedCopy(io.defy.www.coupleadmin.model.data.ContactsData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.defy.www.coupleadmin.model.data.ContactsData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.defy.www.coupleadmin.model.data.ContactsData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.defy.www.coupleadmin.model.data.ContactsData) cachedObject.object;
            }
            unmanagedObject = (io.defy.www.coupleadmin.model.data.ContactsData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface unmanagedCopy = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) unmanagedObject;
        io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface realmSource = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$_id(realmSource.realmGet$_id());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$phone_number(realmSource.realmGet$phone_number());
        unmanagedCopy.realmSet$display_name(realmSource.realmGet$display_name());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$photo_id(realmSource.realmGet$photo_id());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());

        return unmanagedObject;
    }

    static io.defy.www.coupleadmin.model.data.ContactsData update(Realm realm, io.defy.www.coupleadmin.model.data.ContactsData realmObject, io.defy.www.coupleadmin.model.data.ContactsData newObject, Map<RealmModel, RealmObjectProxy> cache) {
        io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface realmObjectTarget = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) realmObject;
        io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface realmObjectSource = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectTarget.realmSet$phone_number(realmObjectSource.realmGet$phone_number());
        realmObjectTarget.realmSet$display_name(realmObjectSource.realmGet$display_name());
        realmObjectTarget.realmSet$email(realmObjectSource.realmGet$email());
        realmObjectTarget.realmSet$photo_id(realmObjectSource.realmGet$photo_id());
        realmObjectTarget.realmSet$date(realmObjectSource.realmGet$date());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ContactsData = proxy[");
        stringBuilder.append("{_id:");
        stringBuilder.append(realmGet$_id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phone_number:");
        stringBuilder.append(realmGet$phone_number());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{display_name:");
        stringBuilder.append(realmGet$display_name() != null ? realmGet$display_name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photo_id:");
        stringBuilder.append(realmGet$photo_id() != null ? realmGet$photo_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy aContactsData = (io_defy_www_coupleadmin_model_data_ContactsDataRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aContactsData.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContactsData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aContactsData.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
