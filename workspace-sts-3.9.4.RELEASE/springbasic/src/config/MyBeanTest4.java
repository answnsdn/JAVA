package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import app3.MyBeanStyle;

public class MyBeanTest4 {
/*
 * 
 */

	public static void main(String[] args) {
		//ApplicationContext���� ����� �� ����.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//�⺻������ singleton�̹Ƿ� getBean�� �� �� ȣ���ص�
		//MyBeanStyleB��ü�� �� ���� �����Ǿ� ȣ��
		//���� init�� �� �� ȣ��ȴ�.
		
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle)factory.getBean("myBean2");
		
		
		run(obj1);
		run(obj2);
		run(obj3);
		//�����̳ʿ� ���� ������ ��ü�� �Ҹ�Ǵ� ������ �����̳ʰ� �Ҹ�� ��
		factory.close();
		

	}
	public static void run(MyBeanStyle obj) {
		
		System.out.println("*****************");
		obj.hello("����"); 
		System.out.println("*****************");
		
	}

}
