package com.example.boom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes(){
        ArrayList<Note> notes = new ArrayList<>();
        noteRepository.findAll().forEach(notes::add);
        return notes;
    }

    public Note getNote(int id){
        if(!noteRepository.existsById(id)) return null;
        return noteRepository.findById(id).get();
    }

    public void addNote(Note note){
        noteRepository.save(note);
    }

    public void updateNote(int id,Note note){
        noteRepository.save(note);
    }

    public void deleteNote(int id){
        noteRepository.deleteById(id);
    }

}
