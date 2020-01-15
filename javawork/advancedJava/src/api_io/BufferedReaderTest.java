package api_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//advancedJava 프로젝트폴더 아래 저장된 test.txt의 내용을 읽어서 콘솔에 출력하기
public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fs = null;
		BufferedReader br = null;
		try {
			//1. 파일 오픈하기
		//fs = new FileReader("src/data/test.txt"); //기본스트림
		//br = new BufferedReader(fs); //보조스트림
		br = new BufferedReader(new FileReader("src/api_io/FileTest01.java")); //스트림 합치기
		int count=0;
		long start=System.nanoTime();
			//2. 파일엑세스
		while(true) {
			String data= br.readLine();
			if(data==null) {
				break;
			}
			count++;
			System.out.print(data);
		}
		long end= System.nanoTime();
		System.out.println("실행횟수 =>"+count);
		System.out.println("실행시간 =>"+(end-start));
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
