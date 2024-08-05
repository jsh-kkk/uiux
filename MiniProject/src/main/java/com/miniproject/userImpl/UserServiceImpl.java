package com.miniproject.userImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.user.UserService;
import com.miniproject.user.UserVO;

@Service("userService")
public abstract class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserVO insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(vo);
	}

}
