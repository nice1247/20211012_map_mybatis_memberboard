package co.nero.prj.board.serviceImpl;

import java.util.Scanner;

import co.nero.prj.board.service.BoardVO;
import co.nero.prj.comm.Command;

public class BoardUpdate implements Command {
	private Scanner scn = new Scanner(System.in);
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("변경할 글의 번호를 입력하세요.");
		vo.setBId(scn.nextInt());scn.nextLine();
		System.out.println("내용을 입력하세요.");
		vo.setBContents(scn.nextLine());
		
		int n = daobs.boardUpdate(vo);
		if(n != 0 ) {
			System.out.println("정상적으로 변경되었습니다.");
		}else {
			System.out.println("글 수정이 실패하였습니다.");
		}
		
	}

}
