package app2;

public class MyBeanTest {
/*
 *  oop�� ����Ǿ� �ִ� ���α׷�
 *  oopƯ���� �����ϱ� ���� ����Ŭ������ �����ϰ� MyBeanStyleXXX Ŭ������ ����ϴ� �Ű�����
 *  Ÿ���� ����Ÿ������ �����ϸ� �������� �����ߴ�.
 *  ���Ǵ� ��ü�� ����Ǵ��� ����� ��ü�� ����ϴ� ������ �ڵ带 �����ϴ� ������ �پ���.
 *  
 *  �׷��� ���� ��ü�� �����ϴ� ������ �����Ͽ� �����ϰ� �ִ�.
 *  ����ϴ� ��ü�� �ٲ𶧸��� ��ü�� ���� �����ϴ� �ڵ带 ��� �����ؾ� �Ѵٴ� ������ �����Ѵ�.
 *  ����ϴ� ������ ���� new�ؼ� ��ü�� �����ϴ� �ڵ�� �������� �ϴ� �ڵ�
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);

	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*****************");
		obj.hello("����");
		System.out.println("*****************");
		
	}

}
