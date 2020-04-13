package com.learner.service.impl;

import java.util.List;

import com.learner.dao.StudentDao;
import com.learner.dao.impl.StudentDaoImpl;
import com.learner.model.Student;
import com.learner.service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDao dao=new StudentDaoImpl();

	@Override
	public Student createStudent(Student student) {
	 return dao.createStudent(student);
	}

	@Override
	public Student getStudentId(int id) {
		return dao.getStudentId(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return dao.getAllStudent();
	}

	@Override
	public void removeStudent(int id) {
		dao.removeStudent(id);
		
	}

	@Override
	public Student updateStudent(Student student) {
		return dao.updateStudent(student);
	}

}
