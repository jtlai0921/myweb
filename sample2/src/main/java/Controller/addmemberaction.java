package Controller;

import com.opensymphony.xwork2.ActionSupport;

import Dao.DaoFactory;
import Dao.implDao;
import Model.member;

@SuppressWarnings("serial")
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
		DaoFactory d=implDao.a2.getBean("DF",DaoFactory.class);
		d.getM().add(new member(getName(),getAddress(),getInterest()));
		
		return "success";
	}
	

}