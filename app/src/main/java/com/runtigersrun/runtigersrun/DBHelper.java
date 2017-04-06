package com.runtigersrun.runtigersrun;

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

    public static final String TD_TABLES_NAME = "TrackDifficulty"
    public static final String
    public static final String
    public static final String
    public static final String
    public static final String
    public static final String





    @Override
    public void onCreate(SQLiteDatabase db) {

    }
}
