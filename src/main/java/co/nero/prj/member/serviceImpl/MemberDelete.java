package co.nero.prj.member.serviceImpl;

import java.util.Scanner;

import co.nero.prj.comm.Command;
import co.nero.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		System.out.println("=================");
		System.out.println("삭제할 멤버의 Id를 입력하세요.");
		vo.setId(scn.nextLine());
		
		int n = daoms.memberDelete(vo);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("게시글이 삭제되지 않았습니다.");
		}
	}

}
