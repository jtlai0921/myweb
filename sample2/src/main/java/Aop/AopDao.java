package Aop;

public class AopDao implements implAop{

	@Override
	public void withAop() {
		System.out.println("執行AOP");
		
	}

	@Override
	public void withoutAop() {
		System.out.println("無AOP");
		
	}

}
