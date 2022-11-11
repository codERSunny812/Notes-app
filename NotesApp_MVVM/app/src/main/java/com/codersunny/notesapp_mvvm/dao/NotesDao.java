package com.codersunny.notesapp_mvvm.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.codeeraayush.notesapp_mvvm.model.NotesEntity;

import java.util.List;

@androidx.room.Dao
public interface NotesDao {


    @Query("Select * From Notes_Db")
    LiveData<List<NotesEntity>>getNotes();


//    List<NotesEntity> getNotes();


    @Insert
    void insert(NotesEntity... notesEntities);


    @Query("Delete From Notes_Db Where id=:id")
    void delete(int id);


    @Update
    void update(NotesEntity notesEntity);


}
