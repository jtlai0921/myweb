package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.student;

public class studentDao implements implDao{

	public static void main(String[] args) {
		student s=new student("abc",10,20);
		new studentDao().add(s);

	}

	@Override
	public void add(Object o) {
		Session se=implDao.getDB();
		Transaction t=se.beginTransaction();
		se.save(o);
		t.commit();
		se.close();
		
	}

}