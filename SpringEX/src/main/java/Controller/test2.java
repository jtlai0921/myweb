package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Model.A;
import Model.B;
import Model.F1;

public class test2 {

	public static void main(String[] args) {
		ApplicationContext A1=new ClassPathXmlApplicationContext("sp1.xml");		
		/*A a1=A1.getBean("a1",A.class);
		A a2=A1.getBean("a2",A.class);
		B b=A1.getBean("b",B.class);
		
		
		System.out.println(a1+"\t"+a1.getLcd());
		System.out.println(a2+"\t"+a2.getLcd());
		System.out.println(b+"\t"+b.getRam());*/
		
		F1 f1=A1.getBean("f1",F1.class);
		
		System.out.println(f1);
		System.out.println(f1.getA1()+"\t"+f1.getA1().getLcd());
		System.out.println(f1.getA2()+"\t"+f1.getA2().getLcd());
		System.out.println(f1.getB()+"\t"+f1.getB().getRam());
		
		System.out.println("=============================");
		F1 f2=A1.getBean("f2",F1.class);
		
		System.out.println(f2);
		System.out.println(f2.getA1()+"\t"+f2.getA1().getLcd());
		System.out.println(f2.getA2()+"\t"+f2.getA2().getLcd());
		System.out.println(f2.getB()+"\t"+f2.getB().getRam());
		System.out.println("=============================");
		F1 f3=A1.getBean("f3",F1.class);
		
		System.out.println(f3);
		System.out.println(f3.getA1()+"\t"+f3.getA1().getLcd());
		System.out.println(f3.getA2()+"\t"+f3.getA2().getLcd());
		System.out.println(f3.getB()+"\t"+f3.getB().getRam());
	}

}