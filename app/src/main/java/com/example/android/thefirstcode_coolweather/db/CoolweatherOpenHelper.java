package com.example.android.thefirstcode_coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lizhaocheng on 15/12/28.
 */
public class CoolweatherOpenHelper extends SQLiteOpenHelper {


    /**
     * Table Province
     */
    public static final String CREATE_PROVICE = "create table Province(id integer primary key autoincrement, province_name text, province_code text)";
    /**
     * table city
     */
    public static final String CREATE_CITY = "create table City(id integer primary key autoincrement, city_name text, city_code text, province_id integer)";

    public static final String CREATE_COUNTY = "create table County(id integer primary key autoincrement, county_name text, county_code text, city_id integer)";

    public CoolweatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVICE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
