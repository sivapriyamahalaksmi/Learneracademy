package com.learner.dao;

import java.util.List;


import com.learner.model.Teacher;

public interface TeacherDao {
	
	public Teacher createTeacher(Teacher teacher);
	public Teacher getTeachertId(int id);
	public List<Teacher> getAllTeacher();
	public void removeTeacher(int id);
	public Teacher updateTeacher(Teacher teacher);
	
	

}
