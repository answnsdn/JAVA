package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import app3.MyBeanStyle;

public class MyBeanTest {
/*
 * �������� �̿��ؼ� ���α׷� �����ϱ�
 * 	- new �����ڸ� �̿��ؼ� ��ü �����ϴ� �ڵ带 ���� �������� �ʴ´�.(API����)
 *  - ������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�.
 */

	public static void main(String[] args) {
		// �������� FactoryŬ������ ����
		
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//�ʿ��� ��ü�� Factory�κ��� �����´�.
		//�������Ͽ� ����� id���� ���� - <bean>�±��� id�Ӽ��� ����
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean");//
		run(obj);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.hello("����");
		System.out.println("*****************");
		
	}

}
