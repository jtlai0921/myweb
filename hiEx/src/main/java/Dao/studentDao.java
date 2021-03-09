package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Model.student;

public class studentDao implements implDao{

	public static void main(String[] args) {
		
		Session se=implDao.getDB();
		String HQL="from student";
		Query q=se.createQuery(HQL);
		
		List<student> l=q.list();
		//System.out.println(l);
		
		for(student s:l)
		{
			System.out.println("id:"+s.getId()+"\tname:"+s.getName());
		}

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