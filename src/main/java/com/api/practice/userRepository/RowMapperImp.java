package com.api.practice.userRepository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.api.practice.entityClass.Data;

public class RowMapperImp implements RowMapper<Data>{

	@Override
	public Data mapRow(ResultSet rs, int rowNum) throws SQLException {
		Data data=new Data();
		data.setId(rs.getInt(1));
		data.setName(rs.getString(2));
		return data;
	}

}
