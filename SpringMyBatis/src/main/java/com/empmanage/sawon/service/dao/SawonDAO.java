package com.empmanage.sawon.service.dao;

import java.util.ArrayList;

import com.empmanage.sawon.vo.SawonVO;

public interface SawonDAO {
	ArrayList<SawonVO> getAllSawon();

	int insertSawon(SawonVO sawonVO);

	SawonVO getOneSawon(SawonVO sawonVO);

	int updateSawon(SawonVO sawonVO);

	int deleteSawon(SawonVO sawonVO);

}
