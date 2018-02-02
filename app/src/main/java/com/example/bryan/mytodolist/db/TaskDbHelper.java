package com.example.bryan.mytodolist.db;

/**The task database helper
 * Created by bryan on 4/24/16.
 */
import android.content.Context;
import android.database.sqlite.*;

public class TaskDbHelper extends SQLiteOpenHelper {

    public TaskDbHelper(Context context)    {
        super(context, TaskAssign.DB_name, null, TaskAssign.DB_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "Create Table " + TaskAssign.TaskEntry.Table + " ( " +
                TaskAssign.TaskEntry._ID + " Integer Primary Key Autoincrement, " +
                TaskAssign.TaskEntry.Col_Task_Title + " Text Not Null);";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer)    {
        db.execSQL("Drop Table If Exists " + TaskAssign.TaskEntry.Table);
        onCreate(db);
    }
}
