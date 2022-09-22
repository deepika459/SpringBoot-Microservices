package com.springmicrouser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springmicrouser.VO.Department;
import com.springmicrouser.VO.ResponseTemplateVO;
import com.springmicrouser.entity.Users;
import com.springmicrouser.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Users saveUser(Users user) {

		return userRepository.save(user);
	}

	public ResponseTemplateVO getByUserDepartment(Long userId) {

		ResponseTemplateVO vo = new ResponseTemplateVO();
		Users user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + user.getDepartmentId(),
				Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}

}
