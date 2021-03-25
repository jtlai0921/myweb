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

	}

}