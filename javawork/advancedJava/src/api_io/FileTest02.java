package api_io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일");
		File file = new File("c:/iot/iotest");
		File[] filelist = file.listFiles();
		for(int i=0;i<filelist.length;i++) {
			if(filelist[i].isDirectory()) {
				System.out.println(filelist[i].getName()
			+"------[폴더]");
			}else {
				System.out.println(filelist[i].getName()+"  "+filelist[i].length()+"  "
																+sdf.format(filelist[i].lastModified()));
			}
		}
		

	}

}
