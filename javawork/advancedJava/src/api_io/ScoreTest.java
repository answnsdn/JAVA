package api_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

//advancedJava 프로젝트폴더 아래 저장된 test.txt의 내용을 읽어서 콘솔에 출력하기
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fs = null;
		BufferedReader br = null;
		try {
			
			
		br = new BufferedReader(new FileReader("src/data/score.txt")); //스트림 합치기
		int count=0;//실행횟수
		int total=0;
		while(true) {
			String line= br.readLine();
			
			
			if(line==null) {
				break;
			}
			String[] data = line.split(",");
			total = total+Integer.parseInt(data[1]);
			count++;
			System.out.println(data[0]+"의 점수는"+data[1]+"점");
		}
			System.out.println(total);
			
			System.out.print(total/count);
		
		
	
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}finally {
	
			//3.파일닫기
		try {
			if(fs!=null)fs.close();
		}catch(IOException e) {
			e.printStackTrace();
	}
	}
	}
}
