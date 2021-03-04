package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface implDao {
	static Session getDB()
	{
		Configuration con=new Configuration().configure();
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		return se;
	}
	//新增
		void add(Object o);
		
		
		//查詢
		
		
		//修改
		
		
		
		//刪除
}