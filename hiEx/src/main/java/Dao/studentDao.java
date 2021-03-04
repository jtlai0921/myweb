package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class studentDao implements implDao{

	public static void main(String[] args) {
		Configuration con=new Configuration().configure();
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();

	}

}