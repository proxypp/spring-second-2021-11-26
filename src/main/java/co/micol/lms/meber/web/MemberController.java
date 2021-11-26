package co.micol.lms.meber.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.micol.lms.meber.service.MemberService;
import co.micol.lms.meber.service.MemberVO;

@Controller
public class MemberController {  //ajax에서는 두가지 방법으로 쓸 수 잇는데 1번째 방법을 많이 추천한다 2번째 방법은 예전에 하던 방식이다.
	@Autowired
	MemberService memberDao;
	
	@RequestMapping("/idcheck.do")
	@ResponseBody
	public String idcheck(Model model, @Param("id") String id) {
		System.out.println(id);
		boolean b = memberDao.isCheckId(id);
		String result ="T";
		if (!b) {
			result = "F";
		}
		return result;
	}
	
//	@RequestMapping("/idcheck.do")
//	public void idcheck(Model model, HttpServletRequest request , HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		String id = request.getParameter("id");
//		System.out.println(request.getParameter(id)+"=======================");
//		boolean b = memberDao.isCheckId(id);
//		String result ="T";
//		if (!b) {
//			result = "F";
//		}
//		out.print(result);
//	}
	@RequestMapping("/memberList.do")
	@ResponseBody
	public List<MemberVO> memberSelectList(){
//		String status = "A";
		return memberDao.memberSelectList("C");
	}
	
}
