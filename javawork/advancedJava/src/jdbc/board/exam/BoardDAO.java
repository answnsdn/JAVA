package jdbc.board.exam;

import java.util.ArrayList;

public interface BoardDAO {
	int insert(BoardDTO board);//boardDTO�� �÷��� ������ ��ü�� �Ѱ����� ���� ���� -C
	int insert(String id,String title, String content);//�Խñ� ���
	int update(int boardNum, String id);//�Խñ� ���� -U
	int delete(int boardNum);//�Խñ� ���� -D
	ArrayList<BoardDTO> Select();//��ü �Խñ� ��ȸ -L
	BoardDTO read(int boardnum);//�Խñ� ��ȸ -R
	ArrayList<BoardDTO> findByTitle(String title);//�Խñ� �˻�
}
