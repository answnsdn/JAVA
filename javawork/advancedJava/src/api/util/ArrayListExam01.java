package api.util;

import java.util.ArrayList;

public class ArrayListExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(79);
		list.add(55);
		list.add(100);
		list.add(98);
		list.add(99);
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum = sum+list.get(i);
		}
		System.out.println("ÃÑÁ¡ : "+sum);
		System.out.println("Æò±Õ : "+sum/list.size());
	}

}
