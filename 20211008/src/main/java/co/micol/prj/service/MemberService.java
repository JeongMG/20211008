package co.micol.prj.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> selectMemberList(); // 전체 목록 가져오기
	MemberVO selectMember(MemberVO vo); // 원하는 한 명 가져오기
	int insertMember(MemberVO vo); // 한 명의 데이터 삽입
	int updateMember(MemberVO vo); // 한 명의 데이터 변경
	int deleteMember(MemberVO vo); // 한 명의 데이터 삭제
}
