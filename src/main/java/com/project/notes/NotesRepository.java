package com.project.notes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends JpaRepository<Notes,Integer> {
    public Notes findById(int id);
    @Query(value = "SELECT * FROM notes_table WHERE title LIKE %:title%", nativeQuery = true)
    public List<Notes> findByTitle(String title);
}
