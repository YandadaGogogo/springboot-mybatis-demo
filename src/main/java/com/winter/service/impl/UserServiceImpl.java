package com.winter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.winter.mapper.UserMapper;
import com.winter.model.User;
import com.winter.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;
	
	@Transactional
	public int addUser(User user){
		//mapper.insertSelective(user);
		//int i = 10/0;
		return mapper.insertSelective(user);
	}

    public List<User> findAllUser(int pageNum, int pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	return mapper.selectAllUser();
    }
}
