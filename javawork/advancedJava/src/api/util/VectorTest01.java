package api.util;

import java.util.Vector;

//Vector를 만들고 사용하는 방법
public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		   //(int의 참조형)
		v.add(10);
		System.out.println("Vector의 용량 : "+v.capacity()); //총 사이즈
		System.out.println("Vector에 저장된 요수 개수 : "+v.size());
		
		
		System.out.println("===================");
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		System.out.println("Vector의 용량 : "+v.capacity());
		System.out.println("Vector에 저장된 요수 개수 : "+v.size());
		
		System.out.println("===================");
		for(int i=1;i<=20;i++) {
			v.add(i);
		}
		System.out.println("Vector의 용량 : "+v.capacity());
		System.out.println("Vector에 저장된 요수 개수 : "+v.size());
	}

}
