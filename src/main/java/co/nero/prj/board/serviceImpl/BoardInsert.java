package co.nero.prj.board.serviceImpl;

import java.util.Scanner;

import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;

public class BoardInsert implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("작성자를 입력하세요.");
		vo.setBWriter(scn.nextLine());
		System.out.println("제목을 입력하세요.");
		vo.setBTitle(scn.nextLine());
		System.out.println("내용을 입력하세요.");
		vo.setBContents(scn.nextLine());
		
		int n = daobs.boardInsert(vo);
		if(n != 0) {
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}
	}

}
