package Dao;

import com.mysql.fabric.xmlrpc.base.Member;

import Model.member;

public class memberDao implements implDao{

	public static void main(String[] args) {
	member m=implDao.a1.getBean("m",member.class);
	
	System.out.println(m.getName());
	
	}

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		
	}

}