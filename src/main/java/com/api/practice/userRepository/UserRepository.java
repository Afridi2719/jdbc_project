package com.api.practice.userRepository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.api.practice.entityClass.Data;

@Repository
public class UserRepository {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public UserRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public List<String> getAllNames(){
		return this.jdbcTemplate.queryForList("select name from Data",String.class);
		//return this.jdbcTemplate.query("select name from Data",(resultSet,rowNum) -> new Data(rowNum, resultSet.getString("name")));
	}

	public int insertData(Data data) {
		String query="insert into Data values(?,?)";
		return this.jdbcTemplate.update(query,data.getId(),data.getName());
	}

	public List<Map<String,Object>> getAllData() {
		String query="select * from Data";
		List<Map<String,Object>> res=this.jdbcTemplate.queryForList(query);
		return res;
	}

}
