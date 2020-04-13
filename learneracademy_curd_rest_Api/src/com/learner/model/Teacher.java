package com.learner.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teachId;
	private String teachName;
	
	public Teacher() {};
	

	@ManyToMany(fetch =FetchType.EAGER)
	private List<Subject> subject=new ArrayList<Subject> ();

	public int getTeachId() {
		return teachId;
	}
	public void setTeachId(int teachId) {
		this.teachId = teachId;
	}
	public String getTeachName() {
		return teachName;
	}
	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}
	
	
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	public Teacher(int teachId, String teachName, List<Subject> subject) {
		super();
		this.teachName = teachName;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [teachId=" + teachId + ", teachName=" + teachName + ", subject=" + subject + "]";
	}
	
}
	
