package Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Model.bookStyle1;

public class test {

	public static void main(String[] args) {
		String[] books= {"java","javaWEB"};
		List<String> address=Arrays.asList("台北","台中","台南","高雄");
		
		Map<String,Double> price=new TreeMap();
		price.put("java7", 600.5);
		price.put("java8", 600.5);
		price.put("javaWEB", 600.5);
		
		Set<String> phone=new TreeSet();
		phone.add("012");
		phone.add("013");
		phone.add("032");
		
		
		bookStyle1 b=new bookStyle1(books,address,price,phone);
		
		
		

	}

}