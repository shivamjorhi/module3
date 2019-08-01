package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Session Entity Class
@Entity
@Table(name = "SessionAriz") // Name of the table in Database
public class Session {

	@Id
	private int id;// Acts as primary key for the table Product
	@Column(name = "name", length = 20) // name and length of Session Name
	private String name;
	@Column(name = "mode", length = 20)
	private String mode;
	@Column(name="faculty",length=20)
	private String faculty;
	@Column(name = "duration")
	private int duration;

	// Default Constructor
	public Session() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Session(int id, String name, String mode, String faculty,int duration) {
		super();
		this.id = id;
		this.name = name;
		this.mode = mode;
		this.faculty=faculty;
		this.duration = duration;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int d) {
		this.duration = d;
	}
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

}
