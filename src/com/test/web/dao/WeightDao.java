package com.test.web.dao;


import com.test.web.bean.WeightBean;

public interface WeightDao {
	
	/* 현재몸무게 추가 */
	public int insertBoard(WeightBean bean);
	/* 한달간의 몸무게 출력 */
	public WeightBean selectBoard(WeightBean bean);
	
}
