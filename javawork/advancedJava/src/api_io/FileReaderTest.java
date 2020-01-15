package api_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//advancedJava ������Ʈ���� �Ʒ� ����� test.txt�� ������ �о �ֿܼ� ����ϱ�
public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fs = null;
		try {
			//1. ���� �����ϱ�
			fs = new FileReader("src/api_io/FileTest01.java");
			//2. ���Ͽ�����
			int count=0;
			long start=System.nanoTime();
			while(true) {
			int data= fs.read();
			if(data==-1) {
				break;
			}
			count++;
			System.out.print((char)data);
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
