package com.service.impl;

import java.util.List;

import com.mapper.MairleaderMapper;
import com.pojo.Mairleader;
import com.service.MairleaderService;
import com.util.MyBatisUtil;

public class MairleaderServiceImpl implements MairleaderService{

	@Override
	public List<Mairleader> showLeaderName() {
		// TODO Auto-generated method stub
		return MyBatisUtil.getSession().getMapper(MairleaderMapper.class).selAllLeaderName();
	}

	
	
}
