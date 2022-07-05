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

    @RequestMapping(value = "/notes")
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @RequestMapping(value = "/notes/{id}")
    public Note getNote(@PathVariable int id){
        return noteService.getNote(id);
    }

    @RequestMapping(value = "/notes",method = RequestMethod.POST)
    public void addNote(@RequestBody Note note){
        noteService.addNote(note);
    }
}
