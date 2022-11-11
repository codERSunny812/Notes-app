package com.codeeraayush.notesapp_mvvm.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.codeeraayush.notesapp_mvvm.model.NotesEntity;
import com.codeeraayush.notesapp_mvvm.repository.NotesRepo;

import java.util.List;


public class NotesView extends AndroidViewModel {

    NotesRepo repository;
    LiveData<List<NotesEntity>>getAllData;



    public NotesView(@NonNull Application application) {
        super(application);
        repository=new NotesRepo(application);
        getAllData=repository.getallNotes;


    }

    void insertData(NotesEntity notes){
        repository.insertNotes(notes);
    }
    void deleteData(int id){
        repository.deleteNotes(id);
    }
    void updateData(NotesEntity notes){
        repository.updateNotes(notes);
    }
}
