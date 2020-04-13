package com.learner.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class ClassPojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int classId;
	private String className;
	
	@OneToMany(fetch =FetchType.EAGER)
	private List<Student> student=new ArrayList<Student>();
	
	@ManyToMany(fetch =FetchType.EAGER)
	private List<Subject> subject=new ArrayList<Subject>();
	
	@OneToMany(fetch =FetchType.EAGER)
	private List<Teacher> teacher=new ArrayList<Teacher>();
	
	public ClassPojo() {}
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public ClassPojo( String className, List<Student> student, List<Subject> subject,
			List<Teacher> teacher) {
		super();
		
		this.className = className;
		this.student = student;
		this.subject = subject;
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "ClassPojo [classId=" + classId + ", className=" + className + ", student=" + student + ", subject="
				+ subject + ", teacher=" + teacher + "]";
	}

	

}
