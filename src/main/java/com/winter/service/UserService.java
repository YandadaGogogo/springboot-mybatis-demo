package com.winter.service;

import java.util.List;

import com.winter.model.User;

public interface UserService {
	public int addUser(User user);

    public List<User> findAllUser(int pageNum, int pageSize);
}
