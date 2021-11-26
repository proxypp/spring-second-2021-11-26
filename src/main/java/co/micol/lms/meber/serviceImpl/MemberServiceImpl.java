package co.micol.lms.meber.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.micol.lms.meber.service.MemberMapper;
import co.micol.lms.meber.service.MemberService;
import co.micol.lms.meber.service.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper map; //dao을 의존 주입한다.
	
	@Override
	public List<MemberVO> memberSelectList(String status) {
		// TODO Auto-generated method stub
		return map.memberSelectList(status);
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberSelect(vo);
	}

	@Override
	public MemberVO memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberInsert(vo);
	}

	@Override
	public MemberVO memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberUpdate(vo);
	}

	@Override
	public MemberVO memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

	@Override
	public boolean isCheckId(String id) {
		// TODO Auto-generated method stub
		return map.isCheckId(id);
	}
}
