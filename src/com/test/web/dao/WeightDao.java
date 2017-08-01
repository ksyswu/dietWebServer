package com.test.web.dao;


import java.util.ArrayList;


import com.test.web.bean.DateBean;
import com.test.web.bean.KgBean;
import com.test.web.bean.WeightBean;

public interface WeightDao {
	
	/* 현재몸무게 추가 */
	public int insertBoard(WeightBean bean);
	
	/* 몸무게 삭제 */
	public int deleteBoard(WeightBean bean);
	
	/* 날짜 몸무게 출력 */
	public WeightBean selectBoard(WeightBean bean);
	
	
//	/* 날짜 몸무게 한달간 출력 */
//	public ArrayList<WeightBean> selectBoard(WeightBean bean);
	
	/* 한달간의 날짜 출력 */
	public ArrayList<DateBean> dateList(WeightBean bean);
	
	/* 한달간의 몸무게 출력 */
	public ArrayList<KgBean> selectBoardList(WeightBean bean);

}
