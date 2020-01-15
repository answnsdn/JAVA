package api_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class InputStreamTest {
	// InputStream�� �̿��ؼ� Ű����� �Է¹޴� ���ڿ��� ���
	//- ScannerŬ������ next�޼ҵ��� ����� ����
	public static void main(String[] args) {
		InputStream in = System.in;
		PrintStream out = System.out;
		
		while(true) {
			//1. ��Ʈ���� �����͸� 1byte �б�
			try {
				int data = in.read();
				if(data == 13) {
					break;
					
				}
				out.print((char)data);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}