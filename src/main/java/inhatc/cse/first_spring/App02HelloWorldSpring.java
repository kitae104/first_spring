package inhatc.cse.first_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring
{

	public static void main(String[] args)
	{
		// 1: 스프링 컨텍스트 실행
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2: 스프링이 관리하기 원하는 항목을 구성 - @Configuration 클래스를 이용한 구성
		var name = context.getBean("name", String.class);
		System.out.println("name: " + name);
	}

}
