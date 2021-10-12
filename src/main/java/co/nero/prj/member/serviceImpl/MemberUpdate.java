package co.nero.prj.member.serviceImpl;

import java.util.Scanner;

import co.nero.prj.comm.Command;
import co.nero.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		System.out.println("변경할 멤버의 Id를 입력하세요.");
		vo.setId(scn.nextLine());
		System.out.println("변경할 이름을 입력해주세요.");
		vo.setName(scn.nextLine());
		System.out.println("변경할 패스워드를 입력해주세요.");
		vo.setPassword(scn.nextLine());
		System.out.println("변경할 연락처를 입력해주세요.");
		vo.setTel(scn.nextLine());
		System.out.println("변경할 주소을 입력해주세요.");
		vo.setAddress(scn.nextLine());
		System.out.println("변경할 권한을 입력해주세요.");
		vo.setAuthor(scn.nextLine());

		int n = daoms.memberUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 변경되었습니다.");
		} else {
			System.out.println("글 수정이 실패하였습니다.");

		}

	}
}
