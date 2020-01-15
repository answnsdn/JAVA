package api.util;

import java.util.HashSet;

import java.util.Iterator;
//Hashset사용하기 - 데이터 저장하고 저장된 데이터 꺼내기
//집합, 중복을 허용하지 않는다.
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		System.out.println("사이즈=>"+set.size());// 결과: 5 => java가 같으므로 한개로 친다.
		
		//set에 저장된 요소를 추출
		//1. HashSet 데이터를 표준 인터페이스(모든 자료 구조에 담긴 데이터를 변환해서 담을 수 있도록 제공되는 추출전용 인터페이스)인 Iterator로 변환
		
	
		Iterator<String> it = set.iterator();
		//2. 변환한 후 추출
		while(it.hasNext()) {//Interator에 저장된 요소가 있는지 확인 - boolean 리턴
			String data = it.next();//Iterator에 저장된 요소를 하나 꺼내서 반납
			System.out.println("꺼낸 요소 : "+data);
		}
		for (String data : set) {
			System.out.println("set에 저장된 요소: "+data);
		}
	}

}
