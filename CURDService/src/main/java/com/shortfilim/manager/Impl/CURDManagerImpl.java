/**
 * 
 */
package com.shortfilim.manager.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shortfilim.dao.beans.UserDO;
import com.shortfilim.dao.mapper.CURDMapper;
import com.shortfilim.manager.CURDManager;

/**
 * @author Muktevi
 *
 */

@Component
public class CURDManagerImpl implements CURDManager{
	
	@Autowired
	private CURDMapper curdMapper;

	public List<UserDO> getUsers() {
		List<UserDO>userDOs = curdMapper.getAllUsers();
		return userDOs;
	}

	public int addUser(UserDO userDO) {
		return curdMapper.insertUser(userDO);
	}

}
