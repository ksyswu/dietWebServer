package com.test.web.dao;

import java.util.List;

import com.test.web.bean.JoinBean;

public interface JoinDao {

	public JoinBean selectMember(JoinBean bean);
	
	public JoinBean idCheckMember(JoinBean bean);
	
	public List<JoinBean> selectMemberList();
	
	/** 회원가입 */
	public int insertMember(JoinBean bean);
	
	/** 회원수정 **/
	public int updateMember(JoinBean bean);
	
	/** 회원삭제 **/
	public int deleteMember(JoinBean bean);
	
	/** 회원 로그인 정보 조회 **/
	public JoinBean loginProc(JoinBean bean);
	
	
	
}
