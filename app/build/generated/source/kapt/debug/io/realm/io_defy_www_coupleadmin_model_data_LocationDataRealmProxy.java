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
public class io_defy_www_coupleadmin_model_data_LocationDataRealmProxy extends io.defy.www.coupleadmin.model.data.LocationData
    implements RealmObjectProxy, io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface {

    static final class LocationDataColumnInfo extends ColumnInfo {
        long _idIndex;
        long latIndex;
        long lngIndex;
        long altIndex;
        long accIndex;
        long dateIndex;

        LocationDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("LocationData");
            this._idIndex = addColumnDetails("_id", "_id", objectSchemaInfo);
            this.latIndex = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lngIndex = addColumnDetails("lng", "lng", objectSchemaInfo);
            this.altIndex = addColumnDetails("alt", "alt", objectSchemaInfo);
            this.accIndex = addColumnDetails("acc", "acc", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
        }

        LocationDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LocationDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LocationDataColumnInfo src = (LocationDataColumnInfo) rawSrc;
            final LocationDataColumnInfo dst = (LocationDataColumnInfo) rawDst;
            dst._idIndex = src._idIndex;
            dst.latIndex = src.latIndex;
            dst.lngIndex = src.lngIndex;
            dst.altIndex = src.altIndex;
            dst.accIndex = src.accIndex;
            dst.dateIndex = src.dateIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private LocationDataColumnInfo columnInfo;
    private ProxyState<io.defy.www.coupleadmin.model.data.LocationData> proxyState;

    io_defy_www_coupleadmin_model_data_LocationDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LocationDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.defy.www.coupleadmin.model.data.LocationData>(this);
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
    public Double realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latIndex);
    }

    @Override
    public void realmSet$lat(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
            }
            row.getTable().setDouble(columnInfo.latIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
        }
        proxyState.getRow$realm().setDouble(columnInfo.latIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$lng() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.lngIndex);
    }

    @Override
    public void realmSet$lng(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lng' to null.");
            }
            row.getTable().setDouble(columnInfo.lngIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'lng' to null.");
        }
        proxyState.getRow$realm().setDouble(columnInfo.lngIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Double realmGet$alt() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.altIndex);
    }

    @Override
    public void realmSet$alt(Double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'alt' to null.");
            }
            row.getTable().setDouble(columnInfo.altIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'alt' to null.");
        }
        proxyState.getRow$realm().setDouble(columnInfo.altIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$acc() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.accIndex);
    }

    @Override
    public void realmSet$acc(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'acc' to null.");
            }
            row.getTable().setFloat(columnInfo.accIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'acc' to null.");
        }
        proxyState.getRow$realm().setFloat(columnInfo.accIndex, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("LocationData", 6, 0);
        builder.addPersistedProperty("_id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lng", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("alt", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("acc", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LocationDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new LocationDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "LocationData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "LocationData";
    }

    @SuppressWarnings("cast")
    public static io.defy.www.coupleadmin.model.data.LocationData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.defy.www.coupleadmin.model.data.LocationData obj = null;
        if (update) {
            Table table = realm.getTable(io.defy.www.coupleadmin.model.data.LocationData.class);
            LocationDataColumnInfo columnInfo = (LocationDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class);
            long pkColumnIndex = columnInfo._idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("_id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("_id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_defy_www_coupleadmin_model_data_LocationDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("_id")) {
                if (json.isNull("_id")) {
                    obj = (io.realm.io_defy_www_coupleadmin_model_data_LocationDataRealmProxy) realm.createObjectInternal(io.defy.www.coupleadmin.model.data.LocationData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_defy_www_coupleadmin_model_data_LocationDataRealmProxy) realm.createObjectInternal(io.defy.www.coupleadmin.model.data.LocationData.class, json.getInt("_id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field '_id'.");
            }
        }

        final io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface objProxy = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) obj;
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                objProxy.realmSet$lat(null);
            } else {
                objProxy.realmSet$lat((double) json.getDouble("lat"));
            }
        }
        if (json.has("lng")) {
            if (json.isNull("lng")) {
                objProxy.realmSet$lng(null);
            } else {
                objProxy.realmSet$lng((double) json.getDouble("lng"));
            }
        }
        if (json.has("alt")) {
            if (json.isNull("alt")) {
                objProxy.realmSet$alt(null);
            } else {
                objProxy.realmSet$alt((double) json.getDouble("alt"));
            }
        }
        if (json.has("acc")) {
            if (json.isNull("acc")) {
                objProxy.realmSet$acc(null);
            } else {
                objProxy.realmSet$acc((float) json.getDouble("acc"));
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
    public static io.defy.www.coupleadmin.model.data.LocationData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.defy.www.coupleadmin.model.data.LocationData obj = new io.defy.www.coupleadmin.model.data.LocationData();
        final io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface objProxy = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) obj;
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
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lat(null);
                }
            } else if (name.equals("lng")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lng((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lng(null);
                }
            } else if (name.equals("alt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$alt((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$alt(null);
                }
            } else if (name.equals("acc")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$acc((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$acc(null);
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

    public static io.defy.www.coupleadmin.model.data.LocationData copyOrUpdate(Realm realm, io.defy.www.coupleadmin.model.data.LocationData object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (io.defy.www.coupleadmin.model.data.LocationData) cachedRealmObject;
        }

        io.defy.www.coupleadmin.model.data.LocationData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.defy.www.coupleadmin.model.data.LocationData.class);
            LocationDataColumnInfo columnInfo = (LocationDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class);
            long pkColumnIndex = columnInfo._idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_defy_www_coupleadmin_model_data_LocationDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static io.defy.www.coupleadmin.model.data.LocationData copy(Realm realm, io.defy.www.coupleadmin.model.data.LocationData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.defy.www.coupleadmin.model.data.LocationData) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        io.defy.www.coupleadmin.model.data.LocationData realmObject = realm.createObjectInternal(io.defy.www.coupleadmin.model.data.LocationData.class, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) newObject).realmGet$_id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface realmObjectSource = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) newObject;
        io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface realmObjectCopy = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectCopy.realmSet$lng(realmObjectSource.realmGet$lng());
        realmObjectCopy.realmSet$alt(realmObjectSource.realmGet$alt());
        realmObjectCopy.realmSet$acc(realmObjectSource.realmGet$acc());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        return realmObject;
    }

    public static long insert(Realm realm, io.defy.www.coupleadmin.model.data.LocationData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.LocationData.class);
        long tableNativePtr = table.getNativePtr();
        LocationDataColumnInfo columnInfo = (LocationDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class);
        long pkColumnIndex = columnInfo._idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Double realmGet$lat = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        }
        Double realmGet$lng = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lng();
        if (realmGet$lng != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
        }
        Double realmGet$alt = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$alt();
        if (realmGet$alt != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.altIndex, rowIndex, realmGet$alt, false);
        }
        Float realmGet$acc = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$acc();
        if (realmGet$acc != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.accIndex, rowIndex, realmGet$acc, false);
        }
        java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.LocationData.class);
        long tableNativePtr = table.getNativePtr();
        LocationDataColumnInfo columnInfo = (LocationDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class);
        long pkColumnIndex = columnInfo._idIndex;
        io.defy.www.coupleadmin.model.data.LocationData object = null;
        while (objects.hasNext()) {
            object = (io.defy.www.coupleadmin.model.data.LocationData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Double realmGet$lat = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            }
            Double realmGet$lng = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lng();
            if (realmGet$lng != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
            }
            Double realmGet$alt = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$alt();
            if (realmGet$alt != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.altIndex, rowIndex, realmGet$alt, false);
            }
            Float realmGet$acc = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$acc();
            if (realmGet$acc != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.accIndex, rowIndex, realmGet$acc, false);
            }
            java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, io.defy.www.coupleadmin.model.data.LocationData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.LocationData.class);
        long tableNativePtr = table.getNativePtr();
        LocationDataColumnInfo columnInfo = (LocationDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class);
        long pkColumnIndex = columnInfo._idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
        }
        cache.put(object, rowIndex);
        Double realmGet$lat = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lat();
        if (realmGet$lat != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
        }
        Double realmGet$lng = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lng();
        if (realmGet$lng != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lngIndex, rowIndex, false);
        }
        Double realmGet$alt = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$alt();
        if (realmGet$alt != null) {
            Table.nativeSetDouble(tableNativePtr, columnInfo.altIndex, rowIndex, realmGet$alt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.altIndex, rowIndex, false);
        }
        Float realmGet$acc = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$acc();
        if (realmGet$acc != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.accIndex, rowIndex, realmGet$acc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.accIndex, rowIndex, false);
        }
        java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.defy.www.coupleadmin.model.data.LocationData.class);
        long tableNativePtr = table.getNativePtr();
        LocationDataColumnInfo columnInfo = (LocationDataColumnInfo) realm.getSchema().getColumnInfo(io.defy.www.coupleadmin.model.data.LocationData.class);
        long pkColumnIndex = columnInfo._idIndex;
        io.defy.www.coupleadmin.model.data.LocationData object = null;
        while (objects.hasNext()) {
            object = (io.defy.www.coupleadmin.model.data.LocationData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$_id());
            }
            cache.put(object, rowIndex);
            Double realmGet$lat = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lat();
            if (realmGet$lat != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.latIndex, rowIndex, realmGet$lat, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latIndex, rowIndex, false);
            }
            Double realmGet$lng = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$lng();
            if (realmGet$lng != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.lngIndex, rowIndex, realmGet$lng, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lngIndex, rowIndex, false);
            }
            Double realmGet$alt = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$alt();
            if (realmGet$alt != null) {
                Table.nativeSetDouble(tableNativePtr, columnInfo.altIndex, rowIndex, realmGet$alt, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.altIndex, rowIndex, false);
            }
            Float realmGet$acc = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$acc();
            if (realmGet$acc != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.accIndex, rowIndex, realmGet$acc, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.accIndex, rowIndex, false);
            }
            java.util.Date realmGet$date = ((io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.dateIndex, rowIndex, realmGet$date.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateIndex, rowIndex, false);
            }
        }
    }

    public static io.defy.www.coupleadmin.model.data.LocationData createDetachedCopy(io.defy.www.coupleadmin.model.data.LocationData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.defy.www.coupleadmin.model.data.LocationData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.defy.www.coupleadmin.model.data.LocationData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.defy.www.coupleadmin.model.data.LocationData) cachedObject.object;
            }
            unmanagedObject = (io.defy.www.coupleadmin.model.data.LocationData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface unmanagedCopy = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) unmanagedObject;
        io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface realmSource = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$_id(realmSource.realmGet$_id());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lng(realmSource.realmGet$lng());
        unmanagedCopy.realmSet$alt(realmSource.realmGet$alt());
        unmanagedCopy.realmSet$acc(realmSource.realmGet$acc());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());

        return unmanagedObject;
    }

    static io.defy.www.coupleadmin.model.data.LocationData update(Realm realm, io.defy.www.coupleadmin.model.data.LocationData realmObject, io.defy.www.coupleadmin.model.data.LocationData newObject, Map<RealmModel, RealmObjectProxy> cache) {
        io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface realmObjectTarget = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) realmObject;
        io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface realmObjectSource = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$lat(realmObjectSource.realmGet$lat());
        realmObjectTarget.realmSet$lng(realmObjectSource.realmGet$lng());
        realmObjectTarget.realmSet$alt(realmObjectSource.realmGet$alt());
        realmObjectTarget.realmSet$acc(realmObjectSource.realmGet$acc());
        realmObjectTarget.realmSet$date(realmObjectSource.realmGet$date());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("LocationData = proxy[");
        stringBuilder.append("{_id:");
        stringBuilder.append(realmGet$_id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lat:");
        stringBuilder.append(realmGet$lat());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lng:");
        stringBuilder.append(realmGet$lng());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{alt:");
        stringBuilder.append(realmGet$alt());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{acc:");
        stringBuilder.append(realmGet$acc());
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
        io_defy_www_coupleadmin_model_data_LocationDataRealmProxy aLocationData = (io_defy_www_coupleadmin_model_data_LocationDataRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aLocationData.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLocationData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aLocationData.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
