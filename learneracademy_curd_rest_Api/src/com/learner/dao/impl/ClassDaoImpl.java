package com.learner.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.learner.dao.ClassDao;
import com.learner.model.ClassPojo;
import com.learner.model.Student;

public class ClassDaoImpl implements ClassDao {
	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	@Override
	public ClassPojo createClass(ClassPojo classpojo) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(classpojo);
		transaction.commit();
		session.close();
		return classpojo;
	}

	@Override
	public ClassPojo getClassId(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		ClassPojo classpojo=(ClassPojo) session.get(ClassPojo.class, id);
		transaction.commit();
		session.close();
		return classpojo;
	}

	@Override
	public List<ClassPojo> getAllClass() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<ClassPojo> classList=session.createQuery("from com.learner.model.ClassPojo").list();
		transaction.commit();
		session.close();
		return classList;
	}

	@Override
	public void removeClass(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		ClassPojo c=new ClassPojo();
		c.setClassId(id);
		session.delete(c);
		transaction.commit();
		session.close();
		
		
	}

	@Override
	public ClassPojo updateClass(ClassPojo classpojo) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(classpojo);
		transaction.commit();
		session.close();
		return classpojo;
	}

}
