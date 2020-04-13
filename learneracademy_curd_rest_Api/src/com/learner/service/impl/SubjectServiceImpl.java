package com.learner.service.impl;

import java.util.List;

import com.learner.dao.SubjectDao;
import com.learner.dao.impl.SubjectDaoImpl;
import com.learner.model.Subject;
import com.learner.service.SubjectService;

public class SubjectServiceImpl implements SubjectService{
	
	SubjectDao dao=new SubjectDaoImpl();

	@Override
	public Subject createSubject(Subject subject) {
		
		return dao.createSubject(subject) ;
	}

	@Override
	public Subject getSubjectId(int id) {
		
		return dao.getSubjectId(id);
	}

	@Override
	public List<Subject> getAllSubject() {
	
		return dao.getAllSubject();
	}

	@Override
	public void removeSubject(int id) {
		 dao.removeSubject(id);
		
	}

	@Override
	public Subject updateSubject(Subject subject) {
	
		return dao.updateSubject(subject);
	}

	
	

	

	

}
