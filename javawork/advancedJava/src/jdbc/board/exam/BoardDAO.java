package jdbc.board.exam;

public interface BoardDAO {
	int insert(BoardDTO board);//boardDTO의 컬럼을 통으로 객체로 넘겨주지 위해 선언
	int insert(String id,String title, String content);
	int update(int boardNum, String id);
	int delete(int boardNum);
	void Select();
}
