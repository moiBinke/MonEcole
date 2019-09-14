package com.emi.MonEcole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emi.MonEcole.entities.Note;
public interface NoteRepository extends JpaRepository<Note,Long> {
	
}
