package api.util;

import java.util.Vector;

//Vector�� ����� ����ϴ� ���
public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		   //(int�� ������)
		v.add(10);
		System.out.println("Vector�� �뷮 : "+v.capacity()); //�� ������
		System.out.println("Vector�� ����� ��� ���� : "+v.size());
		
		
		System.out.println("===================");
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println("Vector�� �뷮 : "+v.capacity());
		System.out.println("Vector�� ����� ��� ���� : "+v.size());
		
		System.out.println("===================");
		for(int i=1;i<=20;i++) {
			v.add(i);
		}
		System.out.println("Vector�� �뷮 : "+v.capacity());
		System.out.println("Vector�� ����� ��� ���� : "+v.size());
	}

}
