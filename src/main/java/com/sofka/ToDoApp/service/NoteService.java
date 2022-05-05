package com.sofka.ToDoApp.service;

import com.sofka.ToDoApp.entity.Note;
import com.sofka.ToDoApp.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface NoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
