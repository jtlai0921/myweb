package Dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Model.student;

public abstract class studentDao implements implDao{

	public static void main(String[] args) {
		
		Session se=implDao.getDB();
		/*String HQL="from student as p where p.id>=?1 and p.id<=?2 and p.name=?3";
		
		Query q=se.createQuery(HQL);		
		q.setParameter(1, 8);
		q.setParameter(2, 13);
		q.setParameter(3, "tttt");
		*/
		String SQL="select * from student";
		SQLQuery q=se.createSQLQuery(SQL);
		q.addEntity(student.class);
		
		List<Object> l=q.list();
		
		for(Object o:l)
		{
			student s=(student)o;
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

	@Override
	public List<Object> queryAll() {
		Session se=implDao.getDB();
		String HQL="from student";
		Query q=se.createQuery(HQL);		
		List<Object> l=q.list();
		
		return l;
	}

}