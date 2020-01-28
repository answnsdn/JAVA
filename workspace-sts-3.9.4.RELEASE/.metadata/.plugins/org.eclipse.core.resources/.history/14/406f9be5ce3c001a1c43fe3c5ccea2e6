package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import app3.MyBeanStyle;

public class MyBeanTest3 {
/*
 * 
 */

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		if(obj1==obj2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		run(obj1);
		run(obj2);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.hello("현빈");
		System.out.println("*****************");
		
	}

}
