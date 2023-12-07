package com.api.practice.userController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.practice.entityClass.Data;
import com.api.practice.userService.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/allData")
	public List<Map<String, Object>> getAllData(){
		return this.userService.getAllData();
	}
	
	@GetMapping("/names")
	public List<String> getAllNames(){
		return this.userService.getAllNames();
	}
	
	@PostMapping("/data")
	public String insertData(@RequestBody Data data) {
		int res=this.userService.insertdata(data);
		if(res==0) {
			return "Not Inserted";
		}else {
			return "Inserted";
		}
		
	}

}
