package com.runtigersrun.runtigersrun;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cjkremm on 4/6/17.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABAS4E_NAME = "RunTigers";

    public static final String USER_TABLE_NAME = "User";
    public static final String USER_COLUMNS_ID = "userID";
    public static final String USER_COLUMNS_FN = "FirstName";
    public static final String USER_COLUMNS_LN = "LastName";
    public static final String USER_COLUMNS_UN = "Username";
    public static final String USER_COLUMNS_PW = "Password";
    public static final String USER_COLUMNS_EM = "Email";
    public static final String USER_COLUMNS_AC = "AccountCreated";

    public static final String GU_TABLE_NAME = "GroupUser";
    public static final String GU_COLUMNS_GUID = "groupUserID";
    public static final String GU_COLUMNS_ID = "groupID";
    public static final String GU_COLUMNS_UID = "userID";

    public static final String GN_TABLE_NAME = "GroupName";
    public static final String GN_COLUMNS_ID = "groupID";
    public static final String GN_COLUMNS_GN = "GroupName";

    public static final String TIMES_TABLE_NAME = "Times";
    public static final String TIMES_COLUMNS_ID = "timeID";
    public static final String TIMES_COLUMNS_ST = "StartTime";
    public static final String TIMES_COLUMNS_ET = "EndTime";
    public static final String TIMES_COLUMNS_RT = "RunTime";
    public static final String TIMES_COLUMNS_UID = "userID";

    public static final String TT_TABLE_NAME = "TrackTimes";
    public static final String TT_COLUMNS_EID = "entryID";
    public static final String TT_COLUMNS_TID = "timeID";
    public static final String TT_COLUMNS_ID = "trackID";

    public static final String TRACK_TABLE_NAME = "Track";
    public static final String TRACK_COLUMNS_ID = "trackID";
    public static final String TRACK_COLUMNS_TN = "TrackName";
    public static final String TRACK_COLUMNS_TID = "typeID";

    public static final String TD_TABLES_NAME = "TrackDifficulty";
    public static final String TD_COLUMNS_TID = "typeID";
    public static final String TD_COLUMNS_T = "Type";

    public static final String TE_TABLE_NAME = "Track Estimotes";
    public static final String TE_COLUMNS_ID = "entryID";
    public static final String TE_COLUMNS_TID = "trackID";
    public static final String TE_COLUMNS_EID = "estimoteID";

    public static final String E_TABLE_NAME = "Estimotes";
    public static final String E_COLUMNS_EID = "estimoteID";
    public static final String E_COLUMNS_EL = "EstimoteLocation";

    public DBHelper(Context context){
        super(context, DATABAS4E_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table User " +
                        "(userID integer primary key, FirstName text,LastName text,Username text,Password text,Email text, AccountCreated text)" +
                "create table contacts " +
                        "(id integer primary key, name text,phone text,email text, street text,place text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
