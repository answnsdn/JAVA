package api_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

//advancedJava ������Ʈ���� �Ʒ� ����� test.txt�� ������ �о �ֿܼ� ����ϱ�
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fs = null;
		BufferedReader br = null;
		try {
			
			
		br = new BufferedReader(new FileReader("src/data/score.txt")); //��Ʈ�� ��ġ��
		int count=0;//����Ƚ��
		int total=0;
		while(true) {
			String line= br.readLine();
			
			
			if(line==null) {
				break;
			}
			String[] data = line.split(",");
			total = total+Integer.parseInt(data[1]);
			count++;
			System.out.println(data[0]+"�� ������"+data[1]+"��");
		}
			System.out.println(total);
			
			System.out.print(total/count);
		
		
	
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
