package config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import app3.MyBeanStyle;
//BeanFactory(컨테이너)가 객체를 관리하는 방법 - 언제 객체를 생성할까?
public class MyBeanTest_BeanFactory {
/* 1. xml을 spring에서 사용할 수 있도록 객체로 변환하는 작업을 수행하는 객체생성
 * 		-> ClassPathResource는 xml문서를 classpath(src)에서 찾는다.
 * 2. 컨테이너객체를 생성
 */

	public static void main(String[] args) {
		System.out.println("***********Resource생성 전**********");
		//1. xml파싱
		
		Resource res = new ClassPathResource("/config/bean.xml");
		//2. 컨테이너객체를 생성
		System.out.println("***********BeanFactory 생성 전**********");
		BeanFactory factory = new XmlBeanFactory(res);
		//3. 컨테이너가 관리하는 객체를 전달받기
		System.out.println("***********GetBean호출 전**********");
		MyBeanStyle obj1 = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2= (MyBeanStyle)factory.getBean("myBean1");
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
