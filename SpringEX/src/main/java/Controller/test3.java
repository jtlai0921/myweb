package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Model.F2;

public class test3 {

	public static void main(String[] args) {
		ApplicationContext a1=new ClassPathXmlApplicationContext("sp2.xml");
		F2 f=a1.getBean("f",F2.class);
		
		System.out.println("A:"+f.getA().getLcd());
		System.out.println("B-b1:"+f.getB1().getRam());
		System.out.println("B-b2:"+f.getB2().getRam());
		System.out.println("C:"+f.getC().getMouse());
		

	}

}