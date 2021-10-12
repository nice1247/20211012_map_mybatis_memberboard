package co.nero.prj.board.serviceImpl;

import java.util.Scanner;

import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;

public class BoardDelete implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("================");
		System.out.println("삭제할 게시글의 번호를 입력하세요.");
		vo.setBId(scn.nextInt());
		int n = daobs.boardDelete(vo);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("게시글이 삭제되지 않았습니다.");
		}
	}

}
