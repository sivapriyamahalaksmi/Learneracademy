package com.learner.service.impl;

import java.util.List;

import com.learner.dao.SubjectDao;
import com.learner.dao.TeacherDao;
import com.learner.dao.impl.SubjectDaoImpl;
import com.learner.dao.impl.TeacherDaoImpl;
import com.learner.model.Teacher;
import com.learner.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	
	TeacherDao dao=new TeacherDaoImpl();


	@Override
	public Teacher createTeacher(Teacher teacher) {
		return dao.createTeacher(teacher);
	}

	@Override
	public Teacher getTeacherId(int id) {
		return dao.getTeachertId(id);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return dao.getAllTeacher();
	}

	@Override
	public void removeTeacher(int id) {
		 dao.removeTeacher(id);
		
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return dao.updateTeacher(teacher);
	}

}
