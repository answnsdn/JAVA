package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import app3.MyBeanStyle;
//BeanFactory(�����̳�)�� ��ü�� �����ϴ� ��� - ���� ��ü�� �����ұ�?
public class MyBeanTest_ApplicationContext {
/* 1. xml�� spring���� ����� �� �ֵ��� ��ü�� ��ȯ�ϴ� �۾��� �����ϴ� ��ü����
 * 		-> ClassPathResource�� xml������ classpath(src)���� ã�´�.
 * 2. �����̳ʰ�ü�� ����
 */

	public static void main(String[] args) {
		// �������� FactoryŬ������ ����
		System.out.println("***********Resource���� ��**********");
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//�ʿ��� ��ü�� Factory�κ��� �����´�.
		//�������Ͽ� ����� id���� ���� - <bean>�±��� id�Ӽ��� ����
		System.out.println("***********GetBeanȣ�� ��**********");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");//
		run(obj);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.hello("����");
		System.out.println("*****************");
		
	}

}