package com.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mapper.AirportMapper;
import com.pojo.Airport;
import com.service.AirportService;
import com.util.MyBatisUtil;

public class AirportServiceImpl implements AirportService{

	@Override
	public List<Airport> showTakePort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		List<Airport> selTakePort = airportMapper.selTakePort();
		return selTakePort;
	}

	@Override
	public List<Airport> showLandPort() {
		SqlSession session = MyBatisUtil.getSession();
		AirportMapper airportMapper = session.getMapper(AirportMapper.class);
		List<Airport> selLandPort = airportMapper.selLandPort();
		return selLandPort;
	}

}
