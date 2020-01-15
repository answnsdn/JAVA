package api_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		FileReader fs = new FileReader("src/api_io/FileTest01.java");
		FileWriter fw = new FileWriter("src/data/copy_result.txt");
				
			while(true) {
			int data = fs.read();
			if(data==-1) {
				break;
			}
			fw.write(data);
			}
		
		//2. 파일 엑세스
		
		//3. 파일 close
		fw.close();
		
	}

}
