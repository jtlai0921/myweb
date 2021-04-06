package Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mysql.fabric.xmlrpc.base.Member;

import Model.member;

public class memberDao implements implDao{

	public static void main(String[] args) {
	
		List l=new memberDao().queryAll();
		member[] m=(member[]) l.toArray(new member[l.size()]);
		String sum="";
		
		for(String o:m[1].getInterest())
		{
			sum=sum+o+" ";
		}
		
		
		System.out.println(m[1].getName()+"\t"+m[1].getAddress()+"\t"+sum);
	}

	@Override
	public void add(Object o) {
		Session se=implDao.getDB();
		Transaction t=se.beginTransaction();
		se.save(o);
		t.commit();
		se.close();
		
	}

	public List queryAll() {
		Session se=implDao.getDB();
		String HQL="from member";
		Query q=se.createQuery(HQL);
		
		List l=q.list();
		
		return l;
	}

}