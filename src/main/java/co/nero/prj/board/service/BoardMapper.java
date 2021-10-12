package co.nero.prj.board.service;

import java.util.List;

public interface BoardMapper { //mybatis에서 사용할 인터페이스 // 틀릴수 있어서 2개 만듬(BoardService)
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	int boardHitUpdate(int id);

}
