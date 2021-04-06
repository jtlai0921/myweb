package Aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MethodAfter implements  AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		for(int i=1;i<=3;i++)
		{
			System.out.println("i="+i+"\t結束AOP"+method.getName());
		}
		
	}

}