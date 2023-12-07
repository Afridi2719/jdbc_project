package com.api.practice.userService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.practice.entityClass.Data;
import com.api.practice.userRepository.UserRepository;

@Component
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public List<String> getAllNames(){
		return this.userRepository.getAllNames();
	}

	public int insertdata(Data data) {
		return this.userRepository.insertData(data);
		
	}

	public List<Map<String,Object>> getAllData() {
		return this.userRepository.getAllData();
	}

}
