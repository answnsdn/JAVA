package config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import app3.MyBeanStyle;
//BeanFactory(�����̳�)�� ��ü�� �����ϴ� ��� - ���� ��ü�� �����ұ�?
public class MyBeanTest_BeanFactory {
/* 1. xml�� spring���� ����� �� �ֵ��� ��ü�� ��ȯ�ϴ� �۾��� �����ϴ� ��ü����
 * 		-> ClassPathResource�� xml������ classpath(src)���� ã�´�.
 * 2. �����̳ʰ�ü�� ����
 */

	public static void main(String[] args) {
		System.out.println("***********Resource���� ��**********");
		//1. xml�Ľ�
		
		Resource res = new ClassPathResource("/config/bean.xml");
		//2. �����̳ʰ�ü�� ����
		System.out.println("***********BeanFactory ���� ��**********");
		BeanFactory factory = new XmlBeanFactory(res);
		//3. �����̳ʰ� �����ϴ� ��ü�� ���޹ޱ�
		System.out.println("***********GetBeanȣ�� ��**********");
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2= (MyBeanStyle)factory.getBean("myBean1");
		if(obj1==obj2) {
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		run(obj1);
		run(obj2);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.hello("����");
		System.out.println("*****************");
		
	}

}