package ute.example.sqlite.sqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "Computer.db";
    public static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE Computer (id int primary key," +
                                            "name text not null)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
//    Use this method when need to change constructure of db or update database
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS Computer";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}
