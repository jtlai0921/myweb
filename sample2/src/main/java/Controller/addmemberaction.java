package Controller;

import com.opensymphony.xwork2.ActionSupport;

public class addmemberaction extends ActionSupport{
	private String name;
	private String address;
	private String[] interest;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	
	public String execute() throws Exception
	{
		System.out.println(getName()+"\t"+getAddress()+"\t"+getInterest());
		
		return "";
	}
	

}