package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.student;

public class studentDao implements implDao{

	public static void main(String[] args) {
		//System.out.println(new studentDao().query(1));
		student s=(student) new studentDao().query(3);
		
		
		new studentDao().deleteObject(s);
		

	}

	@Override
	public void add(Object o) {
		Session se=implDao.getDB();
		Transaction t=se.beginTransaction();
		se.save(o);
		t.commit();
		se.close();
		
	}

	@Override
	public Object query(int id) {
		Session se=implDao.getDB();
		student s=se.get(student.class, id);
		return s;
	}

	@Override
	public void updateObject(Object o) {
		Session se=implDao.getDB();
		Transaction t=se.beginTransaction();
		se.update(o);
		t.commit();
		se.close();
		
	}

	@Override
	public void deleteObject(Object o) {
		Session se=implDao.getDB();
		Transaction t=se.beginTransaction();
		se.delete(o);
		t.commit();
		se.close();
		
	}

}