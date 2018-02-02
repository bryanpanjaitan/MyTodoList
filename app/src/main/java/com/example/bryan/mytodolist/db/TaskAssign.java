package com.example.bryan.mytodolist.db;

/**
 * Created by bryan on 4/24/16.
 */
import android.provider.BaseColumns;

public class TaskAssign {
    public static final String DB_name = "com.example.bryan.mytodolist.db";
    public static final int DB_version = 1;

    public class TaskEntry implements BaseColumns   {
        public static final String Table = "tasks";

        public static final String Col_Task_Title = "title";
    }
}
