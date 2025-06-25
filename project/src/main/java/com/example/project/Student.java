package com.example.project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")	
public class Student {

@Id
@Column(name="id")
@GeneratedValue
private int id;

@Column(name="mark")
 private int mark;

@Column(name="name")
 private String name;
	

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getMark() {
	return mark;
}

public void setMark(int mark) {
	this.mark = mark;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
