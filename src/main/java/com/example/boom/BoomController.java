package com.example.boom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BoomController {
    List<Note> notes = Arrays.asList(new Note(1,"Life","Life is sad yaar"),new Note(2,"Comding","I lub comding a lot"));
    @RequestMapping("/check")
    public List<Note> getNotes(){
        return notes;
    }
}
