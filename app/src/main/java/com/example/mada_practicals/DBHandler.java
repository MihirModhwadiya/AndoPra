package com.example.mada_practicals;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "std";
    private static final int DB_VERSION = 1;

    private static final String TABLE_NAME = "students";
    private static final String COLUMN_ID = "enrollment";
    private static final String COLUMN_STD_NAME = "std_name";

    public DBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_STD_NAME + " TEXT)";
        sqLiteDatabase.execSQL(query);
    }

    public void addStd(String stdName) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_STD_NAME, stdName);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public void updateStd(int enrollmentId, String newName) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_STD_NAME, newName);
        db.update(TABLE_NAME, values, COLUMN_ID + "=?", new String[]{String.valueOf(enrollmentId)});
        db.close();
    }

    public void deleteStd(int enrollmentId) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, COLUMN_ID + "=?", new String[]{String.valueOf(enrollmentId)});
        db.close();
    }

    public String getData() {
        SQLiteDatabase db = this.getWritableDatabase();
        String[] columns = {COLUMN_ID, COLUMN_STD_NAME};
        Cursor cursor = db.query(TABLE_NAME, columns, null, null, null, null, null);
        StringBuffer buffer = new StringBuffer();
        while (cursor.moveToNext()) {
            int cid = cursor.getInt(cursor.getColumnIndex(COLUMN_ID));
            String name = cursor.getString(cursor.getColumnIndex(COLUMN_STD_NAME));
            buffer.append(cid + " " + name + "\n");
        }
        cursor.close();
        return buffer.toString();
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
