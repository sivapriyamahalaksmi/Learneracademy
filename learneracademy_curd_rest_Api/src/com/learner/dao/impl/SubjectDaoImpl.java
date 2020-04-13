package com.learner.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learner.dao.SubjectDao;
import com.learner.model.Subject;
import com.learner.model.Teacher;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SubjectDaoImpl implements SubjectDao{
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	@Override
	public Subject createSubject(Subject subject) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(subject);
		transaction.commit();
		session.close();
		return subject;
	}

	@Override
	public Subject getSubjectId(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Subject subject=(Subject) session.get(Subject.class, id);
		transaction.commit();
		session.close();
		return subject;
	}

	@Override
	public List<Subject> getAllSubject() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Subject> subjectList=session.createQuery("from com.learner.model.Subject").list();
		transaction.commit();
		session.close();
		return subjectList;
	}

	@Override
	public void removeSubject(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Subject s=new Subject();
		s.setSubId(id);
		session.delete(s);
		transaction.commit();
		session.close();
	}

	@Override
	public Subject updateSubject(Subject subject) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
//		Subject s=new Subject();
//		s.setSubId(subject.getSubId());
//		s.setSubName(subject.getSubName());
		session.update(subject);
		transaction.commit();
		session.close();
		return subject;
	}

	
	

}
