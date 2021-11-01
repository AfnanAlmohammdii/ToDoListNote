package com.mynotes.notesappmvvmkotlin.Repository

import androidx.lifecycle.LiveData
import com.mynotes.notesappmvvmkotlin.Dao.NotesDao
import com.mynotes.notesappmvvmkotlin.Model.Notes

class NotesRepository(val dao: NotesDao) {


    fun getAllNotes(): LiveData<List<Notes>> = dao.getNotes()

    fun getLowNotes(): LiveData<List<Notes>> = dao.getLowNotes()

    fun getHighNotes(): LiveData<List<Notes>> = dao.getHighNotes()

    fun getMediumNotes(): LiveData<List<Notes>> = dao.getMediumNotes()


    fun insertNotes(notes: Notes) {
        dao.insertNotes(notes)
    }

    fun deleteNotes(id: Int) {
        dao.deleteNotes(id)
    }

    fun updateNotes(notes: Notes) {
        dao.updateNotes(notes)
    }

}