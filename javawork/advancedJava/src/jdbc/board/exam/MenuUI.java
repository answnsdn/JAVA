package jdbc.board.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		//int result = dao.insert(id, title, content);
		BoardDTO board = new BoardDTO(id,title,content);
		int result = dao.insert(board);
		if(result>0) {
			System.out.println("�Խñ� ��� ����");
			System.out.println(board);
		}else {
			System.out.println("�� ���� ����");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(boardNum,id);
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}else {
			System.out.println("�� ���� ����");
		}
		
		
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(boardNum);
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}else {
			System.out.println("�� ���� ����");
		}
		
	}
	public void searchMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("����:");
		String title = key.next();
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		for(int i=0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getTitle()+"\t"+board.getId()+"\t"+board.getHit());
		}
		
	}
	
	
	public void selectMenu(){
		System.out.println("*******�Խñ���ȸ********");
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<BoardDTO> boardlist = dao.Select();
		int size = boardlist.size();
		for(int i=0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getTitle()+"\t"+board.getId()+"\t"+board.getHit());
		}
	}
	public void readMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("�۹�ȣ:");
		int boardNum = key.nextInt();
		BoardDTO board = dao.read(boardNum);
		
		if(board == null) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		//���⿡�� BoardDAO�� �޼ҵ带 ȣ���ϼ���
		else{
			System.out.println("�۹�ȣ : "+board.getBoardNum());
		
		System.out.println("���� : "+board.getTitle());
		System.out.println("�ۼ��� : "+board.getId());
		System.out.println("���� : "+board.getContent());
		System.out.println("�ۼ���¥ : "+board.getWriteDate());
		System.out.println("��ȸ�� : "+board.getHit());
		}
	}
	
}


















