package com.codersunny.notesapp_mvvm.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.codeeraayush.notesapp_mvvm.dao.NotesDao;
import com.codeeraayush.notesapp_mvvm.database.DbClass;
import com.codeeraayush.notesapp_mvvm.model.NotesEntity;

import java.util.List;

public class NotesRepo {

    public NotesDao notesDao;
    public LiveData<List<NotesEntity>>getallNotes;

    public NotesRepo(Application application) {
        DbClass db=DbClass.getDbInstance(application);
        notesDao=db.notesDao();
        getallNotes=notesDao.getNotes();
    }

    public void insertNotes(NotesEntity notes){
        notesDao.insert(notes);
    }
    public void deleteNotes(int id){
        notesDao.delete(id);
    }
    public void updateNotes(NotesEntity notes){
        notesDao.update(notes);
    }
}
