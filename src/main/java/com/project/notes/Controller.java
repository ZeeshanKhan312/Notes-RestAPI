package com.project.notes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Services services;
    @GetMapping("fetch_all")
    public List<Notes> findAllNotes(){
        return services.fetchAll();
    }
    @GetMapping("search_notes")
    public List<Notes> searchNotes(@RequestParam String title){
        return services.searchNotes(title);
    }

    @PostMapping("add_notes")
    public void addNote(@RequestBody Notes note){
        services.newNote(note);
    }

    @DeleteMapping("delete_notes")
    public void deleteNote(@RequestParam int id){
        services.removeNote(id);
    }

    @PutMapping("update_notes")
    public Notes updateNote(@RequestBody Notes note){
        return services.updateNote(note);
    }
}
