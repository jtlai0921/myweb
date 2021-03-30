package Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="member")
public class member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private List<String> interest;
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public member(String name, String address, List<String> interest) {
		super();
		this.name = name;
		this.address = address;
		this.interest = interest;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public List<String> getInterest() {
		return interest;
	}
	public void setInterest(List<String> interest) {
		this.interest = interest;
	}
	

}