package api_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//advancedJava ������Ʈ���� �Ʒ� ����� test.txt�� ������ �о �ֿܼ� ����ϱ�
public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fs = null;
		BufferedReader br = null;
		try {
			//1. ���� �����ϱ�
		//fs = new FileReader("src/data/test.txt"); //�⺻��Ʈ��
		//br = new BufferedReader(fs); //������Ʈ��
		br = new BufferedReader(new FileReader("src/api_io/FileTest01.java")); //��Ʈ�� ��ġ��
		int count=0;
		long start=System.nanoTime();
			//2. ���Ͽ�����
		while(true) {
			String data= br.readLine();
			if(data==null) {
				break;
			}
			count++;
			System.out.print(data);
		}
		long end= System.nanoTime();
		System.out.println("����Ƚ�� =>"+count);
		System.out.println("����ð� =>"+(end-start));
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}finally {
	
			//3.���ϴݱ�
		try {
			if(fs!=null)fs.close();
		}catch(IOException e) {
			e.printStackTrace();
	}
	}
	}
}
