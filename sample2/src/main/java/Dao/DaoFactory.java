package Dao;

public class DaoFactory {
	private memberDao m;
	private porderDao p;
	public DaoFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DaoFactory(memberDao m, porderDao p) {
		super();
		this.m = m;
		this.p = p;
	}
	public memberDao getM() {
		return m;
	}
	public void setM(memberDao m) {
		this.m = m;
	}
	public porderDao getP() {
		return p;
	}
	public void setP(porderDao p) {
		this.p = p;
	}
	
	

}