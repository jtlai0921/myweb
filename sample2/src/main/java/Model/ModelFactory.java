package Model;

public class ModelFactory {
	private member m;
	private porder p;
	public ModelFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ModelFactory(member m, porder p) {
		super();
		this.m = m;
		this.p = p;
	}
	public member getM() {
		return m;
	}
	public void setM(member m) {
		this.m = m;
	}
	public porder getP() {
		return p;
	}
	public void setP(porder p) {
		this.p = p;
	}
	
	

}