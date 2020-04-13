package com.learner.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learner.dao.StudentDao;
import com.learner.model.Student;


public class StudentDaoImpl implements StudentDao {
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	@Override
	public Student createStudent(Student student) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public Student getStudentId(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=(Student) session.get(Student.class, id);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Student> studentList=session.createQuery("from com.learner.model.Student").list();
		transaction.commit();
		session.close();
		return studentList;
	}

	@Override
	public void removeStudent(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Student stu=new Student();
		stu.setStudId(id);
		session.delete(stu);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Student updateStudent(Student student) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(student);
		transaction.commit();
		session.close();
		return student;
	}

}
