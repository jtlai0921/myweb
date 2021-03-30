package Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Model.bookStyle1;

public class test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("sp1.xml");
		
		bookStyle1 b=a.getBean("b",bookStyle1.class);
		
		
		System.out.println(b.show());

	}

}