package com.codersunny.notesapp_mvvm.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.codeeraayush.notesapp_mvvm.dao.NotesDao;
import com.codeeraayush.notesapp_mvvm.model.NotesEntity;

@Database(entities = {NotesEntity.class},version = 1)
public abstract class DbClass extends RoomDatabase {


    public static DbClass INSTANCE;
    public abstract NotesDao notesDao();


//    create or get instance of database

    public static DbClass getDbInstance(Context context){
        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context.getApplicationContext()
                    ,DbClass.class
                    ,"NotesEntity").build();

        }
        return INSTANCE;
    }
}
