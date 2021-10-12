package co.nero.prj.member.serviceImpl;

import java.util.Scanner;

import co.nero.prj.comm.Command;
import co.nero.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner scn = new Scanner(System.in);


	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("==================");
		System.out.println("조회할 멤버의 ID를 입력하세요.");
		member.setId(scn.nextLine());
		member = daoms.memberSelect(member);
		
		System.out.println("ID : "+member.getId());
		System.out.println("이름 : "+member.getName());
		System.out.println("패스워드 : "+member.getPassword());
		System.out.println("연락처 : "+member.getTel());
		System.out.println("주소 : "+member.getAddress());
		System.out.println("권한 : "+member.getAuthor());

	}

}
