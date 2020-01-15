package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set의 주요기능인 합집합 교집합 기능을 구현해 보기
public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음과같은 변수명으로 HashSet객체 2개작성하기
		//set1 -> 1부터 10까지의 정수
		//set2 -> 5부터 15까지의 정수
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=1;i<=10;i++) {
			set1.add(i);
		}
		
		print(set1,"set1");
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i=5;i<=15;i++) {
			set2.add(i);
		}
		print(set2,"set2");
		
		//합집합을 구현하는 방법 => Set객체를 생성할 때 합집합으로 표현할 Set을 생성자의 매개변수로 전달
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		for(int data : set2) {
			set3.add(data);
		}
		print(set3,"set3");
				
		
		
		//set1과 set2의 교집합 구하기
		set1.retainAll(set2);
		print(set1,"교집합set");//set과 set3에 저장된 요수 중 중복되는 요소만 가지고 새로운 set구조가 만들어진다.
							//일치하는 것만 남기고 나머지는 제거된다.
		
	}
	public static void print(Set<Integer> set, String setName ) {
		System.out.println("사이즈=>"+set.size());
		for(int data : set) {
			System.out.println(setName+"에 저장된 요소 : "+ data);
		}
		System.out.println("=========================");
	}
}
