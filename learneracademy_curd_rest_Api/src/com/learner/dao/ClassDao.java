package com.learner.dao;

import java.util.List;

import com.learner.model.ClassPojo;


public interface ClassDao {
	
	public ClassPojo createClass(ClassPojo classpojo);
	public ClassPojo getClassId(int id);
	public List<ClassPojo> getAllClass();
	public void removeClass(int id);
	public ClassPojo updateClass(ClassPojo classpojo);

}
