package api.util;

import java.util.ArrayList;

public class ArrayListTest02 {
	//Collection�� ������ ����� Ÿ���� generic���·� �����Ѵ�.
	//CollectionŬ����<������Ÿ��> ex)ArrayList<Person>
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ڹ�");
		list.add("����Ŭ");
		list.add("JDBC");
		list.add("HTML5");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
