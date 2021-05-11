package com.service.impl;

import java.util.List;

import com.mapper.MairnoMapper;
import com.pojo.Mairno;
import com.service.MairnoService;
import com.util.MyBatisUtil;

public class MairnoServiceImpl implements MairnoService{

	@Override
	public List<Mairno> showMairno() {
		// TODO Auto-generated method stub
		return MyBatisUtil.getSession().getMapper(MairnoMapper.class).selAllAir();
	}

}
