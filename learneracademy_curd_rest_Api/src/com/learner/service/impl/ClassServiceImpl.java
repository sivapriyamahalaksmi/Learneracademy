package com.learner.service.impl;

import java.util.List;

import com.learner.dao.ClassDao;
import com.learner.dao.impl.ClassDaoImpl;
import com.learner.model.ClassPojo;
import com.learner.service.ClassService;

public class ClassServiceImpl implements ClassService {
	
	ClassDao dao=new ClassDaoImpl();

	@Override
	public ClassPojo createClass(ClassPojo classpojo) {
			return dao.createClass(classpojo);
	}

	@Override
	public ClassPojo getClassId(int id) {
			return dao.getClassId(id);
	}

	@Override
	public List<ClassPojo> getAllClass() {
			return dao.getAllClass();
	}

	@Override
	public void removeClass(int id) {
		dao.removeClass(id);
		
	}

	@Override
	public ClassPojo updateClass(ClassPojo classpojo) {
			return dao.updateClass(classpojo);
	}

}
