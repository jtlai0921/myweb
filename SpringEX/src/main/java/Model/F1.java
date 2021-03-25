package Model;

public class F1 {
	private A a1;
	private A a2;
	private B b;
	public F1() {
		super();
		a1=new A();
		a2=new A(10);
		b=new B();
	}
	public A getA1() {
		return a1;
	}
	public void setA1(A a1) {
		this.a1 = a1;
	}
	public A getA2() {
		return a2;
	}
	public void setA2(A a2) {
		this.a2 = a2;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}

}
