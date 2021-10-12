package co.nero.prj.board.serviceImpl;

import java.util.Scanner;

//import co.nero.prj.board.service.BoardService;
import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;

public class BoardSelect implements Command {
//	private BoardService boardService = new BoardServiceImpl();
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("==================");
		System.out.println("조회할 게시글 번호를 입력하세요.");
		board.setBId(scn.nextInt());
		board = daobs.boardSelect(board);

		System.out.println("번호 : " + board.getBId());
		System.out.println("작성자 : " + board.getBWriter());
		System.out.println("작성일자 : " + board.getBWriteDate());
		System.out.println("제목 : " + board.getBTitle());
		System.out.println("내용 : " + board.getBContents());
		System.out.println("조회수 : " + board.getBHit());

	}

}
