package Controller;

import Model.A;
import Model.B;
import Model.F1;

public class test {

	public static void main(String[] args) {
		F1 f=new F1();
		
		System.out.println(f.getA1().getLcd());
		System.out.println(f.getA2().getLcd());
		System.out.println(f.getB().getRam());
		
		System.out.println("=============================");
		A a1=new A(30);
		a1.setLcd(50);
		A a2=new A(5);
		B b=new B(15);
		
		
		F1 f2=new F1(a1,a2,b);
		System.out.println(f2.getA1().getLcd());
		System.out.println(f2.getA2().getLcd());
		System.out.println(f2.getB().getRam());
		

	}

}