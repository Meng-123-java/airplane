package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pojo.Mairno;

public interface MairnoMapper {

	@Select("select * from mairno where id in (select distinct airnoid from airplane)")
	List<Mairno> selAllAir();
	
}
