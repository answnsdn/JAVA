package api.util;

import java.util.HashSet;

import java.util.Iterator;
//Hashset����ϱ� - ������ �����ϰ� ����� ������ ������
//����, �ߺ��� ������� �ʴ´�.
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
		System.out.println("������=>"+set.size());// ���: 5 => java�� �����Ƿ� �Ѱ��� ģ��.
		
		//set�� ����� ��Ҹ� ����
		//1. HashSet �����͸� ǥ�� �������̽�(��� �ڷ� ������ ��� �����͸� ��ȯ�ؼ� ���� �� �ֵ��� �����Ǵ� �������� �������̽�)�� Iterator�� ��ȯ
		
	
		Iterator<String> it = set.iterator();
		//2. ��ȯ�� �� ����
		while(it.hasNext()) {//Interator�� ����� ��Ұ� �ִ��� Ȯ�� - boolean ����
			String data = it.next();//Iterator�� ����� ��Ҹ� �ϳ� ������ �ݳ�
			System.out.println("���� ��� : "+data);
		}
		for (String data : set) {
			System.out.println("set�� ����� ���: "+data);
		}
	}

}
