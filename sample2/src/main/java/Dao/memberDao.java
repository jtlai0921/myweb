package Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mysql.fabric.xmlrpc.base.Member;

import Model.member;

public class memberDao implements implDao{

	public static void main(String[] args) {
	member m=implDao.a1.getBean("m",member.class);
	
	//System.out.println(m.getName());
	
	new memberDao().add(m);
	
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