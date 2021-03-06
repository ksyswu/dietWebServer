package com.test.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.web.bean.JoinBean;
import com.test.web.dao.JoinDao;

@Controller
public class JoinController {
	
	@Autowired
	private JoinDao joinDao;

	//DB --> Bean ---> JSON
		@RequestMapping("/rest/loginProc")
		@ResponseBody
		public Map<String, Object> selectMember(JoinBean mBean) {
			
			Map<String, Object> resMap = new HashMap<String, Object>();
			
			try {
				JoinBean resBean = joinDao.loginProc(mBean);
				
				if(resBean == null) {
					resMap.put("result",  "fail");
					resMap.put("resultMsg", "해당하는 유져가 없습니다. \n아이디와 비밀번호를 확인 해 주세요.");
				}else {
					resMap.put("result",  "ok");
					resMap.put("resultMsg",  "로그인 성공");
					resMap.put("joinBean",  resBean);
				}
				
				
			} catch(Exception e) {
				e.printStackTrace();
				resMap.put("result", "fail");
			}
			
			return resMap;
		}
}
