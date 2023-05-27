package com.project.notes;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {
    @Autowired
    NotesRepository notesRepository;

    public List<Notes> fetchAll() {
        List<Notes> notes=notesRepository.findAll();
        return notes;
    }

    public List<Notes> searchNotes(String title) {
        List<Notes> notes=notesRepository.findByTitle(title);
        return notes;
    }

    public void newNote(Notes note) {
        notesRepository.save(note);
    }

    public void removeNote(int id) {
        notesRepository.deleteById(id);
    }

    public Notes updateNote(Notes note) {
//        Notes notes=notesRepository.findById(note.getId());
//        notes.setTitle(note.getTitle());
//        notes.setText(note.getText());
        notesRepository.save(note);
        return note;
    }
}
