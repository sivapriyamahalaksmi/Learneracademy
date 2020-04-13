package com.learner.service;

import java.util.List;

import com.learner.model.ClassPojo;


public interface ClassService {
	
	public ClassPojo createClass(ClassPojo classpojo);
	public ClassPojo getClassId(int id);
	public List<ClassPojo> getAllClass();
	public void removeClass(int id);
	public ClassPojo updateClass(ClassPojo classpojo);

}
