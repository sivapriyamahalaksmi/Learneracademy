package com.learner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studId;
	private String studName;
	
	public Student() {}
	
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}


	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	
}
