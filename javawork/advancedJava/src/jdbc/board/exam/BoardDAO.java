package jdbc.board.exam;

import java.util.ArrayList;

public interface BoardDAO {
	int insert(BoardDTO board);//boardDTO의 컬럼을 통으로 객체로 넘겨주지 위해 선언 -C
	int insert(String id,String title, String content);//게시글 등록
	int update(int boardNum, String id);//게시글 수정 -U
	int delete(int boardNum);//게시글 삭제 -D
	ArrayList<BoardDTO> Select();//전체 게시글 조회 -L
	BoardDTO read(int boardnum);//게시글 조회 -R
	ArrayList<BoardDTO> findByTitle(String title);//게시글 검색
}
