package com.example.boom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    private NoteService noteService;

    @Autowired
    NoteController(NoteService noteService){
        this.noteService = noteService;
    }

    @GetMapping( "/notes")
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/notes/{id}")
    public Note getNote(@PathVariable int id){
        return noteService.getNote(id);
    }

    @PostMapping( "/notes")
    public void addNote(@RequestBody Note note){
        noteService.addNote(note);
    }

    @PutMapping("/notes")
    public void updateNote(@RequestBody Note note){
        noteService.updateNote(note);
    }

    @DeleteMapping("/notes/{id}")
    public void deleteNote(@PathVariable int id){
        noteService.deleteNote(id);
    }
}
