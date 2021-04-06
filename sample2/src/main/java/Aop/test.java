package Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.implDao;

public class test {

	public static void main(String[] args) {
		ApplicationContext a1=new ClassPathXmlApplicationContext("sp3.xml");
		implAop iaop=(implAop) a1.getBean("aopDao");
		iaop.withAop();
//		
		new AopDao().withAop();
	}

}