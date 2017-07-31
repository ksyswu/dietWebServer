package com.test.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.web.bean.DateBean;
import com.test.web.bean.JoinBean;
import com.test.web.bean.KgBean;
import com.test.web.bean.WeightBean;
import com.test.web.dao.JoinDao;
import com.test.web.dao.WeightDao;

@Controller
public class RESTController {

	@Autowired
	private JoinDao joinDao;
	
	@Autowired
	private WeightDao weightDao;
	
	//DB --> Bean ---> JSON
	@RequestMapping("/rest/selectMember")
	@ResponseBody
	public Map<String, Object> selectMember(JoinBean mBean) {
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		
		try {
			JoinBean resBean = joinDao.selectMember(mBean);
			
			resMap.put("result", "ok");
			resMap.put("joinBean", resBean);
			
		} catch(Exception e) {
			e.printStackTrace();
			resMap.put("result", "fail");
		}
		
		return resMap;
	}
	
	
	//DB --> Bean ---> JSON
	@RequestMapping("/rest/selectMemberList")
	@ResponseBody
	public Map<String, Object> selectMemberList() {
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		
		try {
			List<JoinBean> list = joinDao.selectMemberList();
		
			resMap.put("result", "ok");
			resMap.put("joinList", list);
			
		} catch(Exception e) {
			e.printStackTrace();
			resMap.put("result", "fail");
		}
		
		return resMap;
	}
	
	
	//DB --> Bean ---> JSON
		@RequestMapping("/rest/idCheckMember")
		@ResponseBody
		public Map<String, Object> idCheckMember(JoinBean mBean) {
			
			Map<String, Object> resMap = new HashMap<String, Object>();
			
			try {
				JoinBean resBean = joinDao.idCheckMember(mBean);
				
				if( resBean != null) {
					resMap.put("resultMsg", "이미 존재하는 USER_ID 입니다.");
				}else {
					resMap.put("resultMsg", "사용가능한 ID입니다");
				}
				
			} catch(Exception e) {
				e.printStackTrace();
				resMap.put("resultMsg", e.getMessage());
			}
			
			return resMap;
		}
	
	
	
	
	//DB --> Bean ---> JSON
	@RequestMapping("/rest/insertMember")
	@ResponseBody
	public Map<String, Object> insertMember(JoinBean mBean) {
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("result", "fail");
		
		try {
			
			if(mBean.getUserId() == null || mBean.getUserId().length() ==0 || mBean.getUserPw() == null || mBean.getUserPw().length() ==0) {
				
				resMap.put("resultMsg", "아이디와 비밀번호를 입력하세요");
				return resMap;
			}
			
			int resVal = joinDao.insertMember(mBean);
			if(resVal > 0) {
				resMap.put("result", "ok");
			}
				
		} 
		catch(DuplicateKeyException dke) {
			resMap.put("resultMsg", "이미 존재하는 USER_ID 입니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
			resMap.put("resultMsg", e.getMessage());
		}
		
		return resMap;
	}
	
	
	//DB --> Bean ---> JSON
	@RequestMapping("/rest/updateMember")
	@ResponseBody
	public Map<String, Object> updateMember(JoinBean mBean) {
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("result", "fail");
		
		try {
			
			int resVal = joinDao.updateMember(mBean);
			if(resVal > 0) {
				resMap.put("result", "ok");
				resMap.put("resultMsg", "업데이트에 성공 하였습니다.");
			}
			else {
				resMap.put("result", "fail");
				resMap.put("resultMsg", "존재하지 않는 USER_ID 입니다.");
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
			resMap.put("resultMsg", e.getMessage());
		}
		
		return resMap;
	}
	
	
	//DB --> Bean ---> JSON
	@RequestMapping("/rest/deleteMember")
	@ResponseBody
	public Map<String, Object> deleteMember(JoinBean mBean) {
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		resMap.put("result", "fail");
		
		try {
			
			int resVal = joinDao.deleteMember(mBean);
			if(resVal > 0) {
				resMap.put("result", "ok");
				resMap.put("resultMsg", "삭제에 성공 하였습니다.");
			}
			else {
				resMap.put("result", "fail");
				resMap.put("resultMsg", "존재하지 않는 USER_ID 입니다.");
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
			resMap.put("resultMsg", e.getMessage());
		}
		
		return resMap;
	}
	
	
	
	
	
	
	
	//DB --> Bean ---> JSON
		@RequestMapping("/rest/selectBoard")
		@ResponseBody
		public Map<String, Object> selectBoard(WeightBean mBean) {
			
			Map<String, Object> resMap = new HashMap<String, Object>();
			
			try {
				WeightBean resBean = weightDao.selectBoard(mBean);
				
				resMap.put("result", "ok");
				resMap.put("joinBean", resBean);
				
			} catch(Exception e) {
				e.printStackTrace();
				resMap.put("result", "fail");
			}
			
			return resMap;
		}
		
		
		//DB --> Bean ---> JSON
		@RequestMapping("/rest/selectBoardList")
		@ResponseBody
		public Map<String, Object> selectBoardList() {
			
			Map<String, Object> resMap = new HashMap<String, Object>();
			
			try {
				List<KgBean> list = weightDao.selectBoardList();
			
				resMap.put("result", "ok");
				resMap.put("selectBoardList", list);
				
			} catch(Exception e) {
				e.printStackTrace();
				resMap.put("result", "fail");
			}
			
			return resMap;
		}
		
		
		
		//DB --> Bean ---> JSON
				@RequestMapping("/rest/dateList")
				@ResponseBody
				public Map<String, Object> dateList() {
					
					Map<String, Object> resMap = new HashMap<String, Object>();
					
					try {
						List<DateBean> list = weightDao.dateList();
					
						resMap.put("result", "ok");
						resMap.put("dateList", list);
						
					} catch(Exception e) {
						e.printStackTrace();
						resMap.put("result", "fail");
					}
					
					return resMap;
				}
				
		
		
		
		//DB ---> Bean --->JSON 임의의값을 넣어 주는 것
		@RequestMapping("/rest/insertBoard")
		@ResponseBody
		public Map<String, Object> insertBoard(WeightBean mBean){

			Map<String, Object> resMap = new HashMap<String, Object>();
			resMap.put("result", "fail");

			try {
				
				if(mBean.getD_kg() == null || mBean.getD_kg().length() ==0) {
					
					resMap.put("resultMsg", "몸무게를 입력해주세요");
					return resMap;
				}
				
				int resVal = weightDao.insertBoard(mBean);
				if(resVal > 0) {
					resMap.put("result",  "ok");
					resMap.put("resultMsg",  "몸무게를 추가하였습니다");
				}
			}catch(DuplicateKeyException dke) {
//				resMap.put("result", "fail");
				resMap.put("resultMsg",  "이미 오늘의 몸무게를 입력했습니다");
			}
			catch(Exception e) {
				e.printStackTrace();
				resMap.put("resultMsg", e.getMessage());
			}
			return resMap;
		}
		
		
		
		//DB --> Bean ---> JSON
		@RequestMapping("/rest/deleteBoard")
		@ResponseBody
		public Map<String, Object> deleteBoard(WeightBean mBean) {
			
			Map<String, Object> resMap = new HashMap<String, Object>();
			resMap.put("result", "fail");
			
			try {
				
				int resVal = weightDao.deleteBoard(mBean);
				if(resVal > 0) {
					resMap.put("result", "ok");
					resMap.put("resultMsg", "삭제에 성공 하였습니다.");
				}
				else {
					resMap.put("result", "fail");
					resMap.put("resultMsg", "존재하지 않는 날짜입니다.");
				}
			} 
			catch(Exception e) {
				e.printStackTrace();
				resMap.put("resultMsg", e.getMessage());
			}
			
			return resMap;
		}
		
		
		
		
	
	
}
