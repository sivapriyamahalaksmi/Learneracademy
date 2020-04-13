package com.learner.service;

import java.util.List;


import com.learner.model.Teacher;

public interface TeacherService {
	
	public Teacher createTeacher(Teacher teacher);
	public Teacher getTeacherId(int id);
	public List<Teacher> getAllTeacher();
	public void removeTeacher(int id);
	public Teacher updateTeacher(Teacher teacher);

}
