package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import app3.MyBeanStyle;
//BeanFactory(컨테이너)가 객체를 관리하는 방법 - 언제 객체를 생성할까?
public class MyBeanTest_ApplicationContext {
/* 1. xml을 spring에서 사용할 수 있도록 객체로 변환하는 작업을 수행하는 객체생성
 * 		-> ClassPathResource는 xml문서를 classpath(src)에서 찾는다.
 * 2. 컨테이너객체를 생성
 */

	public static void main(String[] args) {
		// 스프링의 Factory클래스를 생성
		System.out.println("***********Resource생성 전**********");
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//필요한 객체를 Factory로부터 가져온다.
		//설정파일에 등록한 id명을 정의 - <bean>태그의 id속성을 정의
		System.out.println("***********GetBean호출 전**********");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");//
		run(obj);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.hello("현빈");
		System.out.println("*****************");
		
	}

}
