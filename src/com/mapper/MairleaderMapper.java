package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pojo.Mairleader;

public interface MairleaderMapper {

	@Select("select * from mairleader where id in (select distinct leaderid from airplane)")
	List<Mairleader> selAllLeaderName();
	
}
