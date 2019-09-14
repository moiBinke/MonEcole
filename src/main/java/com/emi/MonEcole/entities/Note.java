package com.emi.MonEcole.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Note {
	@Id
	@Column
	private long idNote;
}
