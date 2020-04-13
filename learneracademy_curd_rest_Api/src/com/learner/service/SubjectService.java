package com.learner.service;

import java.util.List;

import com.learner.model.Subject;

public interface SubjectService {

	public Subject createSubject(Subject subject);
	public Subject getSubjectId(int id);
	public List<Subject> getAllSubject();
	public void removeSubject(int id);
	public Subject updateSubject(Subject subject);
	
	
	
}
