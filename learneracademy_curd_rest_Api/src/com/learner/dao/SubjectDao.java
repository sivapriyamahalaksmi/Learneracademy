package com.learner.dao;

import java.util.List;

import com.learner.model.Subject;

public interface SubjectDao {
	
	public Subject createSubject(Subject subject);
	public Subject getSubjectId(int id);
	public List<Subject> getAllSubject();
	public void removeSubject(int id);
	public Subject updateSubject(Subject subject);
	

	
	

}
