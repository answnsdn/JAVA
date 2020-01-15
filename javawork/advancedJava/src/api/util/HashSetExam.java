package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set�� �ֿ����� ������ ������ ����� ������ ����
public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������� ���������� HashSet��ü 2���ۼ��ϱ�
		//set1 -> 1���� 10������ ����
		//set2 -> 5���� 15������ ����
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
		
		//�������� �����ϴ� ��� => Set��ü�� ������ �� ���������� ǥ���� Set�� �������� �Ű������� ����
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		for(int data : set2) {
			set3.add(data);
		}
		print(set3,"set3");
				
		
		
		//set1�� set2�� ������ ���ϱ�
		set1.retainAll(set2);
		print(set1,"������set");//set�� set3�� ����� ��� �� �ߺ��Ǵ� ��Ҹ� ������ ���ο� set������ ���������.
							//��ġ�ϴ� �͸� ����� �������� ���ŵȴ�.
		
	}
	public static void print(Set<Integer> set, String setName ) {
		System.out.println("������=>"+set.size());
		for(int data : set) {
			System.out.println(setName+"�� ����� ��� : "+ data);
		}
		System.out.println("=========================");
	}
}
