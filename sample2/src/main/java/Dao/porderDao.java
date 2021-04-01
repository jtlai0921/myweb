package Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Model.porder;

public class porderDao implements implDao{

	public static void main(String[] args) {
		porder p=a1.getBean("p",porder.class);
		
		new  porderDao().add(p);

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