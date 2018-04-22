package com.AM.whatsbug.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.AM.whatsbug.sql.DBHelper;

/**
 * Created by Tan on 3/14/2016.
 */


public class Searchmodel {
    private DBHelper dbHelper;

    public Searchmodel(Context context) {
        dbHelper = new DBHelper(context);
    }

    public int insert(Search search) {

        //Open connection to write data
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Search.KEY_age, search.age);
        values.put(Search.KEY_email,search.email);
        values.put(Search.KEY_name, search.name);

        // Inserting Row
        long student_Id = db.insert(Search.TABLE, null, values);
        db.close(); // Closing database connection
        return (int) student_Id;
    }
    public Cursor  getStudentList() {
        //Open connection to read only
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  rowid as " +
                Search.KEY_ROWID + "," +
                Search.KEY_ID + "," +
                Search.KEY_name + "," +
                Search.KEY_email + "," +
                Search.KEY_age +
                " FROM " + Search.TABLE;


        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list

        if (cursor == null) {
            return null;
        } else if (!cursor.moveToFirst()) {
            cursor.close();
            return null;
        }
        return cursor;


    }


    public Cursor  getStudentListByKeyword(String search) {
        //Open connection to read only
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  rowid as " +
                Search.KEY_ROWID + "," +
                Search.KEY_ID + "," +
                Search.KEY_name + "," +
                Search.KEY_email + "," +
                Search.KEY_age +
                " FROM " + Search.TABLE +
                " WHERE " +  Search.KEY_name + "  LIKE  '%" +search + "%' "
                ;


        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list

        if (cursor == null) {
            return null;
        } else if (!cursor.moveToFirst()) {
            cursor.close();
            return null;
        }
        return cursor;


    }

    public Search getStudentById(int Id){
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT " +
                Search.KEY_ID + "," +
                Search.KEY_name + "," +
                Search.KEY_email + "," +
                Search.KEY_age +
                " FROM " + Search.TABLE
                + " WHERE " +
                Search.KEY_ID + "=?";// It's a good practice to use parameter ?, instead of concatenate string

        int iCount =0;
        Search search = new Search();

        Cursor cursor = db.rawQuery(selectQuery, new String[] { String.valueOf(Id) } );

        if (cursor.moveToFirst()) {
            do {
                search.student_ID =cursor.getInt(cursor.getColumnIndex(Search.KEY_ID));
                search.name =cursor.getString(cursor.getColumnIndex(Search.KEY_name));
                search.email  =cursor.getString(cursor.getColumnIndex(Search.KEY_email));
                search.age =cursor.getString(cursor.getColumnIndex(Search.KEY_age));

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return search;
    }




}