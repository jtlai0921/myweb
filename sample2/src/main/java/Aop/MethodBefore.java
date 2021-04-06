package Aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBefore implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		for(int i=1;i<=3;i++)
		{
			System.out.println("i="+i+"\t準備啟動AOP"+method.getName());
		}
		
	}

}