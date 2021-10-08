package co.micol.prj;

import co.micol.prj.exe.MainMenu;

//import java.util.ArrayList;
//import java.util.List;
//
//import co.micol.prj.service.MemberService;
//import co.micol.prj.service.MemberVO;
//import co.micol.prj.dao.DataSource;
//import co.micol.prj.serviceImpl.MemberServiceImpl;

public class MainApp {
	public static void main(String[] args) {
//		DataSource dao = DataSource.getInstance(); // 싱글톤 dao
//		dao.getConnection();
		
//		MemberService memberService = new MemberServiceImpl();
//		List<MemberVO> members = new ArrayList<MemberVO>();
//		
//		MemberVO vo = new MemberVO();
//		vo.setId("kim");
//		vo.setPassword("4567");
//		vo.setName("김치국");
//		vo.setTel(null);
//		vo.setAddress(null);
//		vo.setAuthor("USER");
//		
//		int n = memberService.insertMember(vo);
//		if(n != 0) {
//			System.out.println("잘 입력되었습니다.");
//		} else {
//			System.out.println("입력이 실패했습니다.");
//		}
//		System.out.println("==============================");
//		
//		members = memberService.selectMemberList();
//		for(MemberVO member : members) {
//			member.toString();
//		}	
		
		MainMenu mainMenu = new MainMenu();
		mainMenu.run();
	}
}
